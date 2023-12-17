fun main() {
    val pinBlock = generatePinBlock("2143", "5199111215194619")
    println("Sample Output -> $pinBlock")
}



fun fromHex(c: Char): Int {
    return when {
        c in '0'..'9' -> c - '0'
        c in 'A'..'F' -> c - 'A' + 10
        c in 'a'..'f' -> c - 'a' + 10
        else -> throw IllegalArgumentException()
    }
}

fun toHex(nybble: Int): Char {
    if (nybble < 0 || nybble > 15) {
        throw IllegalArgumentException()
    }
    return "0123456789ABCDEF"[nybble]
}

fun xorHex(a: String, b: String): String {
    val chars = CharArray(a.length)
    for (i in chars.indices) {
        chars[i] = toHex(fromHex(a[i]) xor fromHex(b[i]))
    }
    return String(chars).toUpperCase()
}

@Throws(Exception::class)
fun generatePinBlock(pin: String, cardNumber: String): String {
    if (pin.length !in 4..6) {
        throw IllegalArgumentException("Invalid PIN length")
    }

    // Alternatively, you can use:
    // val pinBlock = StringUtils.rightPad("0$pin", 16, 'F')
    var pinBlock = String.format("%s%d%s", "0", pin.length, pin)
    while (pinBlock.length != 16) {
        pinBlock += "F"
    }

    val cardLen = cardNumber.length
    val pan = "0000" + cardNumber.substring(cardLen - 13, cardLen - 1)
    return xorHex(pinBlock, pan)
}

// Example

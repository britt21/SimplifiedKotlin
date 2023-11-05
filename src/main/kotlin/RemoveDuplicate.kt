

fun main() {
    val a = listOf(1, 2, 3, 4)
    val b = listOf(7, 5, 3, 4, 3, 6, 9, 8)

    val combinedList = (a + b).distinct().sorted()

    println("Combined List in Ascending Order without Repeating Elements: $combinedList")
}




fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = 0
    var start = 0
    val charIndexMap = mutableMapOf<Char, Int>()

    for (end in s.indices) {
        val currentChar = s[end]
        if (charIndexMap.containsKey(currentChar)) {
            start = maxOf(start, charIndexMap[currentChar]!! + 1)
        }
        charIndexMap[currentChar] = end
        maxLength = maxOf(maxLength, end - start + 1)
    }

    return maxLength
}



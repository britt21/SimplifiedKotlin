fun main() {
    val a = "383393939A"
    val result = a.filter { it.isDigit() }
    println(result) // This will print: 383393939
}
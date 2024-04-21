import kotlin.math.ceil

fun main() {
    val result = 30000.0 / 615
    val roundedResult = ceil(result * 100) / 100 // Round up to two decimal places
    val formattedResult = String.format("%.2f", roundedResult)
    println(roundedResult)
}

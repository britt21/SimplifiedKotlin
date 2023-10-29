import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val dateFormat = SimpleDateFormat("dd/MM/yyyy, hh:mm a")
    val currentTime = Date()
    val formattedDate = dateFormat.format(currentTime)
    println(formattedDate)
}
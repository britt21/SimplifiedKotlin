import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.concurrent.TimeUnit

fun main(){
//    val currentDateTime = Calendar.getInstance().time
//    val formatter = SimpleDateFormat("y/yyy-MM-dd HH:mm:ss")
//    val formattedDateTime = formatter.format(currentDateTime)
//    println("Formatted Current Date and Time: $formattedDateTime")
//
//    var value = "1"
//    value = (value.toInt() + 2).toString()
//    println("DVAL: $value")

    var currtime = System.currentTimeMillis()
    var min = TimeUnit.MILLISECONDS.toSeconds(currtime)
    println(min)

}
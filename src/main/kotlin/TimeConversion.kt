

fun main(){

    println(time("07:05:45PM"))
}

fun time(s: String): String{

    var time = s
    if (time.contains("AM")){
      var splittedtime =   time.split(":")
       var refirst =  splittedtime.get(0).toInt()
        if (refirst > 11) {
           var convfirst =  refirst.toString()
            convfirst = "00"
            var secondtime = splittedtime.get(1)
            var thirdtime = splittedtime.get(2)
            var finaltime = "${convfirst}:${secondtime}:${thirdtime.removeSuffix("AM")}"

            return  finaltime

        }else{

            var normaltime = "${splittedtime[0]}:${splittedtime[1]}:${splittedtime[2].removeSuffix("AM")}"
            return  normaltime

        }
    }else if (time.contains("PM")){
        var splittedtime =   time.split(":")
        if (splittedtime[0].toInt() < 12){
            var refirst = splittedtime[0].toInt() + 12
            var secondtime = splittedtime.get(1)
            var thirdtime = splittedtime.get(2)

            var finaltime = "${refirst}:${secondtime}:${thirdtime.removeSuffix("PM")}"
            return finaltime
        }else{
            var normaltime = "${splittedtime[0]}:${splittedtime[1]}:${splittedtime[2].removeSuffix("PM")}"
            return  normaltime

        }

    }

    return ""
}
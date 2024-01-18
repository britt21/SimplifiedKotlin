

fun main(){


    println("DCARDBONE      " + extractPanAccountNumberPart("5061191608212220947"))
}




fun extractPanAccountNumberPart(accountNumber: String): String? {


    //5061191608212220947
    // 119160821222

    var subeer = accountNumber.substring(3, accountNumber.length - 1)
    println("dub     " + subeer)

    return subeer

}
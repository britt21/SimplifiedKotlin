fun extractCSNFromTrack2(track2Data: String): String? {
    try {
        // Split the Track 2 data using the field separator (usually the '=' character)
        val track2Fields = track2Data.split('=')

        // The CSN might be part of the discretionary data, which is typically the last field
        val discretionaryData = track2Fields.lastOrNull()

        println("LAST OR NULL" + discretionaryData)
        // Extract the CSN from the discretionary data (assuming it is a fixed length)
        val csnLength = 4 // Adjust based on the actual length of the CSN
        return discretionaryData?.take(csnLength)
    } catch (e: Exception) {
        // Handle parsing errors
        e.printStackTrace()
        return null
    }
}

fun main() {

//    val csn = extractCSNFromTrack2("5199111215194619D2508221005822560F")
//
//    if (csn != null) {
//        println("Card Sequence Number (CSN): $csn")
//    } else {
//        println("Failed to extract Card Sequence Number.")
//    }

    val expiryDate = "2508"
    val formattedExpiryDate = "expiryDate=${expiryDate.substring(0, 2)}/${expiryDate.substring(2)}"
    println(formattedExpiryDate)


}



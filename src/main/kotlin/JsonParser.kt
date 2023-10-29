fun main() {

    var response = "{responseCode: 200, responseMessage: Invoice Retrieved Successfully, data: null}"
    var statusresponse = "{statusCode: 200, message: Invoice Retrieved Successfully, data: \"\"}"

    val keyValuePairs = statusresponse
        .replace("{", "")
        .replace("}", "")
        .split(",")

    val keyValueMap = keyValuePairs.associate {
        val (key, value) = it.split(":").map { it.trim('"', ' ') }
        key to value
    }

    val specificKey = keyValueMap.keys.find { it == "responseMessage" || it == "message" }
    if (specificKey != null) {
        val value = keyValueMap.getValue(specificKey)
        println("Key: $specificKey, Value: $value")
    } else {
        println("Key not found or value is null for the specified keys.")
    }
}

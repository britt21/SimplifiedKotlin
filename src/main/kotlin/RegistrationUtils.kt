class AuthClass {


    fun validateAuth(
        username: String,
        pass: String,
    ): Boolean {
        if (username.isBlank()) {
            return false
        }
        if (username.any { it.isDigit() }) {
            return false
        }

        if (pass.any { it.isLetter() }) {
            return false
        }
        if (pass.length < 2) {
            return false
        }
        if (username.length < 2) {
            return false
        }

        if (pass.isBlank()){
            return false
        }

        return true

    }
}
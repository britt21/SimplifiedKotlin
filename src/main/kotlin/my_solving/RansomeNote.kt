package my_solving

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var letterCount = mutableMapOf<Char,Int>()


        magazine.toCharArray().forEach{ char ->

            letterCount[char] = letterCount.getOrDefault(char,0) + 1

        }

        ransomNote.toCharArray().forEach{ char ->
           var count =   letterCount.getOrDefault(char,0)
            if (count == 0){
                return false
            }
            letterCount[char] = count -1


//            println(count)

        }

        println(letterCount)
        return true

    }


fun main(){
    println(canConstruct("ab","aab"))
}

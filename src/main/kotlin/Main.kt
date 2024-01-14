import kotlinx.coroutines.*


// fun main() {
//     println(canConstruct("bcb", "bbc"))
//
// }
//
//fun canConstruct(ransomNote: String, magazine: String): Boolean {
//
//    var lettercount = mutableMapOf<Char,Int>()
//
//    ransomNote.toCharArray().forEach { char ->
//        lettercount[char] = lettercount.getOrDefault(char,0) + 1
//
//        println("dk : ${lettercount}")
//    }
//
//    magazine.toCharArray().forEach { char ->
//      var count =   lettercount.getOrDefault(char,0)
//        if (count == 0){
//            return false
//        }
////        lettercount[char] =  count- 1
//
//        println(count)
//    }
//
//
//    return true
//
//}
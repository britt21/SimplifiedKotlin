
fun longestSubstring(s: String): Int {

    var  map = mutableMapOf<Char,Int>()

    s.toCharArray().forEach {char ->
        map[char] = map.getOrDefault(char,0) + 1
        var count =  map.getOrDefault(char,0)
        if(count == 1){
        }
        println(""  + map)
    }

return map.keys.size
}

fun main(){
    println(longestSubstring("pwwkew"))
}
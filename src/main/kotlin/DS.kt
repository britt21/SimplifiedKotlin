
class Solution() {

}

fun solution(numbers:List<Long>) : Long {

    var largeNumber = 0L

    if(numbers.isEmpty()){
        return 0
    }else{


        for(number in numbers){

            if(number > largeNumber){
                largeNumber = number


            }
        }
        return largeNumber
    }
}


fun main(){

    println(containsDuplicate(intArrayOf(1,2,3)))
}

fun reversed(x : Long): Long{
    var result = 0L
    var input = x

    while (input.toInt() != 0) {
        val pop = input % 10
        input /= 10

        if (result > Int.MAX_VALUE / 10 || result < Int.MIN_VALUE / 10) return 0
        result = result * 10 + pop
    }

    return result
}

fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()

    for (num in nums) {
        if (!set.add(num)) {
            return true
        }
    }

    return false
}



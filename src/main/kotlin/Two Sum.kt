
fun twoSum(nums: IntArray, target: Int): IntArray {
    val eachnums = mutableMapOf<Int, Int>()

    for (i in nums.indices) {

        var compliment = target - nums[i]
        if (eachnums.containsKey(compliment)){
            return intArrayOf(eachnums[compliment]!!,i)
        }

        eachnums[nums[i]] =  i

    }
    return intArrayOf()
}
fun main(){
    println(twoSum(intArrayOf(2,7,11,15),9).contentToString())
}
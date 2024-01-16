
//     println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
fun maxSubArray(nums: IntArray): Int {

    var maxSum = nums[0]
    var currentSum = nums[0]
    for (i in 1 until nums.size) {
        var summedsum =    currentSum + nums[i]
        var numis =    nums[i]
        currentSum = maxOf(nums[i], nums[i] + currentSum)

        var currsum = currentSum


        maxSum = maxOf(maxSum, currentSum)
//
        var maxsums = maxSum
    }

    // Return the maximum sum found.
    return maxSum
}


fun main(){
    println(maxSubArray(intArrayOf(5,4,-1,7,8)))
}




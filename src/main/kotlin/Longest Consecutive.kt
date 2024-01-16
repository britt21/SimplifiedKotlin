fun longestConsecutive(nums: IntArray): Int {


    var renums = nums.sorted()
    var left = renums[0]
    var count = 1
    var maxcount = 1


    for (i in 1 until renums.size) {

        if (renums[i] == left + 1) {
            count++
        } else if (renums[i] != left) {
            count = 1
        }

        left = renums[i]
        maxcount = maxOf(maxcount, count)
    }

    return maxcount
}

fun main() {
    println(longestConsecutive(intArrayOf(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6)))
}
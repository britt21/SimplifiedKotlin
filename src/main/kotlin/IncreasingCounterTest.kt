
// decode thsi c-d-l-t-y-t-s-t

/**
 * There is an array A made of N integers.Your task is to choose as many integers from A
 * as possible so that,when they are put in ascending order,all of the differences between
 * all pairs of consecutive integers are equal.
 * For example,for A [4,3,5,1,4,4],you could choose 1,3 and 5 (with differences equal
 * to 2)or 4,4 and 4 (with differences equal to 0).
 * What is the maximum number of integers that can be chosen?
 * Write a function:
 * */
fun solution(A: IntArray): Int {
    val sortedArray = A.sorted() // Sort the array

    var maxCount = 0
    for (i in 0 until sortedArray.size) {
        for (j in i + 1 until sortedArray.size) {
            var count = 2 // Initialize with 2 elements
            var diff = sortedArray[j] - sortedArray[i]
            var next = sortedArray[j] + diff

            for (k in j + 1 until sortedArray.size) {
                if (sortedArray[k] == next) {
                    count++
                    next += diff
                }
            }
            maxCount = maxOf(maxCount, count)
        }
    }

    return maxCount
}


/**
 * There are two candy shops,both of which have N candies for sale.The first shop sells
 * each candy for one golden coin;the second shop sells each candy for one silver coin.
 * You have N/2 golden coins and N/2 silver ones (N is even).
 * Each candy is of some particular type (not necessarily unique),represented by an
 * integer.What is the maximum number of different types of candy that you can buy?
 * Write a function:
 * fun solution(A:IntArray,B:IntArray):Int
 * that,given two arrays A and B of N integers,representing types of candies in the first
 * and second shop respectively,returns the maximum possible number of different types
 * of candy that you can buy.
 * For example,given:
 * A=【1,2,3,4]
 * B=[3,3,3,7]
 * the function should return 4.You can,for example,buy candies of types 1,2 in the first
 * shop and then candies of types 3,7 in the second shop.
 * Given:
 * A=[2,2,2,2,2,2]
 * B=[7,4,2,5,1,2]
 * the function should also return 4.In the first shop you can only buy candies of type 2,
 * but then you can buy three candies of other types (for example,7,4 and 5)in the
 * second shop.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [2..100,000];
 * N is even;
 * each element of arrays A and B is an integer within the range
 * [1.1,000,000,000]
 * **/


fun solution(A: IntArray, B: IntArray): Int {
    val setA = A.toSet()
    val setB = B.toSet()

    var counter = 0

    for (type in setA) {
        if (type !in setB) {
            counter++
        }
    }

    for (type in setB) {
        if (type !in setA) {
            counter++
        }
    }

    return if (counter % 2 == 0 && counter != 0) counter else counter - 1
}


fun solutionf(A: IntArray, S: Int): Int {
    var count = 0

    for (i in A.indices) {
        var sum = 0
        for (j in i until A.size) {
            sum += A[j]
            val segmentLength = j - i + 1
            if (sum.toDouble() / segmentLength == S.toDouble()) {
                count++
            }
        }
    }

    return if (count > 1_000_000_000) 1_000_000_000 else count
}


fun main(){

    println(solutionf(intArrayOf(2,1,4), 3))
//    println(solution(intArrayOf(4, 7, 1, 5, 3)))
}
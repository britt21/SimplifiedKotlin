import kotlinx.coroutines.*


 fun main() {

    var fruitlist = ArrayList<ArrayList<ArrayList<String>>>()

    fruitlist.add(arrayListOf(arrayListOf("apples","mangoes","grapes")))

    println(fruitlist.flatten().flatten())


    }

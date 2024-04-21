val items = listOf(
        "Apple",
        "Banana",
        "Orange",
        "Grapes",
        "Strawberry",
        "Watermelon",
)

//var textFields = listOf(
//        fruits.map {
//            PrintField(header = " ", body = null, bold = true, alignment = "left", textSize = 20)
//            PrintField(header = "", body = it, bold = true, alignment = "left", textSize = 20)
//
//        }
//
//
//)





var printFieldHeader =  PrintField(header = "Qty Product", body = "Amount", bold = true, alignment = "left", textSize = 20)

//var printBody = fruits.map {  PrintField(header = "1", body = it, bold = true, alignment = "left", textSize = 20)}

var allBody = ArrayList<PrintField>()


fun main(){

    var printField = ArrayList<PrintField>()



    printField.add(
            PrintField( header ="Quantity     Product Name" ,body = "Amount", bold = true, alignment = "left",textSize = 20)

    )

    items.map {

        printField.add(
                PrintField(
                        header = "${it}      ${it}",
                        body = "${it}",
                        bold = true,
                        alignment = "left",
                        textSize = 20
                )

        )
    }
//    items.data!!.data.map {
//
//        printField.add(
//                PrintField(
//                        header = "",
//                        body = "${it.amount}",
//                        bold = true,
//                        alignment = "center",
//                        textSize = 20
//                )
//        )
//    }




    println("ALLDATAHERE: " + printField)

}
data class PrintField(
        val header: String,
        val body: String? = null,
        val alignment: String,
        val textSize: Int = 26,
        val bold: Boolean,
        val isMultiLine: Boolean = false
)

data class Receipt
(
        val textFields: List<PrintField>,
        val logo: String? = "",
        val withBarCode: Boolean = false
)
package lesson_1_10.lesson_9

fun main() {

    val omeletList = mutableListOf(2, 50, 15)

    println("Сколько порций омлета вы хотите приготовить?")
    val numDishes = readln().toInt()
    val omeletListFinal = omeletList.map { it * numDishes }

    println(
        "На $numDishes порций вам понадобится: Яиц – ${omeletListFinal[0]}шт," +
                " молока – ${omeletListFinal[1]}мл," +
                " сливочного масла – ${omeletListFinal[2]}гр."
    )
}
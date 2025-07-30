package lesson_9

fun main() {

    val omeletList = mutableListOf(2, 50, 15)

    println("Сколько порций омлета вы хотите приготовить?")
    val numDishes = readln().toInt()

    val eggsQnty = omeletList[0] * numDishes
    val milkQnty = omeletList[1] * numDishes
    val oilQnty = omeletList[2] * numDishes

    println(
        "На $numDishes порций вам понадобится: Яиц – ${eggsQnty}шт," +
                " молока – ${milkQnty}мл," +
                " сливочного масла – ${oilQnty}гр."
    )
}
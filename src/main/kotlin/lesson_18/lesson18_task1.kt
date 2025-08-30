package lesson_18

class Order(number: Int) {

    fun getOrder(
        goods: String,
    ) {
        println("Заказан товар: $goods")
    }

    fun getOrder(
        goods: List<String>,
    ) {
        println("Заказаны следующие товары: ${goods.joinToString(", ")}")
    }
}

fun main() {
    val newOrder = Order(1)
    newOrder.getOrder("PS5")
    val newOrder2 = Order(2)
    newOrder2.getOrder(listOf("PS5", "Xbox", "Nintendo"))
}
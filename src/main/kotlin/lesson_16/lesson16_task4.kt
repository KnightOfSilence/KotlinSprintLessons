package lesson_16

import kotlin.io.println

class Order(
    private val number: Int,
    var isReady: Boolean = false,
) {
    fun getOrderNumber(): Int {
        return number
    }

    fun changeOrderStatus(order: Boolean) {
        isReady = order
    }
}

fun queryToManager(order: Order, query: Boolean) {
    order.changeOrderStatus(query)
}

fun main() {
    val order = Order(1)
    queryToManager(order, true)
    println("Заказ ${order.getOrderNumber()} готов: ${order.isReady}")
}
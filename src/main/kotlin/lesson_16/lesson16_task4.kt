package lesson_16


class Order(
    private val number: Int,
    private var isReady: Boolean = false,
) {
    fun getOrderNumber(): Int {
        return number
    }

    fun getOrderStatus(): Boolean {
        return isReady
    }

    private fun changeOrderStatus(order: Boolean) {
        isReady = order
    }
    fun queryToManager(order: Order, query: Boolean) {
        order.changeOrderStatus(query)
    }
}



fun main() {
    val order = Order(1)
    order.queryToManager(order, true)
    println("Заказ ${order.getOrderNumber()} готов: ${order.getOrderStatus()}")
}
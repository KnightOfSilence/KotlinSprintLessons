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

    private fun changeOrderStatus(newStatus: Boolean) {
        isReady = newStatus
    }

    fun queryToManager(newStatus: Boolean) {
        changeOrderStatus(newStatus)
    }
}

fun main() {
    val order = Order(1)
    order.queryToManager(true)
    println("Заказ ${order.getOrderNumber()} готов: ${order.getOrderStatus()}")
}
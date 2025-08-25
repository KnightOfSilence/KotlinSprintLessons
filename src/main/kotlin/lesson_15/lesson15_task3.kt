package lesson_15

abstract class User(val name: String) {

    abstract fun readMessage()
    abstract fun sendMessage()
}

class RegularUser(name: String) : User(name) {

    override fun readMessage() {
        println("Пользователь $name прочитал сообщение.")
    }

    override fun sendMessage() {
        println("Пользователь $name отправил сообщение.")
    }
}

class AdminUser(name: String) : User(name) {
    override fun readMessage() {
        println("Администратор $name прочитал сообщение.")
    }

    override fun sendMessage() {
        println("Администратор $name отправил сообщение.")
    }

    fun deleteMessage() {
        println("Администратор $name удалил сообщение.")
    }

    fun deleteUsers() {
        println("Администратор $name удалил пользователя.")
    }
}

fun main() {
    val regularUser = RegularUser("Иван")
    regularUser.readMessage()
    regularUser.sendMessage()
    println()
    val adminUser = AdminUser("Мария")
    adminUser.readMessage()
    adminUser.sendMessage()
    adminUser.deleteMessage()
    adminUser.deleteUsers()
}

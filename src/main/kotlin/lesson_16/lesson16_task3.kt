package lesson_16

class User(
    private val login: String,
    private val password: String
) {
    fun isPasswordCorrect() {
        println("Введите пароль")
        val userPassword: String = readln()

        if (userPassword == password) {
            println("Вход выполнен успешно")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = User("admin", "qwerty")
    user.isPasswordCorrect()
}
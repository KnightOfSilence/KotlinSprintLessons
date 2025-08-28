package lesson_16

import kotlin.io.println

class User(
    private val login: String,
    private val password: String
) {
    fun isPasswordCorrect(userPassword: String): Boolean {
        return userPassword == password
    }
}

fun main() {
    val user = User("admin", "qwerty")

    println("Введите пароль")
    val userPassword: String = readln()

    if (user.isPasswordCorrect(userPassword)) {
        println("Вход выполнен успешно")
    } else {
        println("Неверный пароль")
    }
}
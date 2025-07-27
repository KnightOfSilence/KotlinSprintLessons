package lesson_6

fun main() {
    println("Добро пожаловать! Зарегистрируйтесь, пожалуйста.")
    println("Введите ваш логин")
    val login = readln()
    println("Введите ваш пароль")
    val password = readln()

    do {
        println("Ваш логин")
        val user_login = readln()
        println("Ваш пароль")
        val user_password = readln()
    } while (user_login != login && user_password != password)
    println("Авторизация прошла успешно")
}
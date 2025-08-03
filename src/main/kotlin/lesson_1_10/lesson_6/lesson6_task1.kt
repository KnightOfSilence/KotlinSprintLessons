package lesson_1_10.lesson_6

fun main() {

    println("Добро пожаловать! Зарегистрируйтесь, пожалуйста.")
    println("Введите ваш логин")
    val login = readln()
    println("Введите ваш пароль")
    val password = readln()

    do {
        println("Ваш логин")
        val userLogin = readln()
        println("Ваш пароль")
        val userPassword = readln()
    } while (userLogin != login || userPassword != password)

    println("Авторизация прошла успешно")
}
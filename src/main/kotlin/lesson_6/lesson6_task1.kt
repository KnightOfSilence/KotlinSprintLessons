package lesson_6

fun main() {
    println("Добро пожаловать! Зарегистрируйтесь, пожалуйста.")
    println("Введите ваш логин")
    val login = readln()
    println("Введите ваш пароль")
    val password = readln()

    println("Ваш логин")
    var user_login = readln()
    println("Ваш пароль")
    var user_password = readln()

    while (user_login != login && user_password != password) {
        println("Ваш логин")
        user_login = readln()
        println("Ваш пароль")
        user_password = readln()
    }
    println("Авторизация прошла успешно")
}
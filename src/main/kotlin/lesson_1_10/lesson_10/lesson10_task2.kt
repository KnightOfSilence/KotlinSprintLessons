package lesson_1_10.lesson_10

const val PASSWORD_LENGTH = 4

fun main() {

    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    if (properLength(userLogin, userPassword)) {
        println("Добро пожаловать в приложение!")
    }
    else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun properLength(login: String, password: String): Boolean {

    return login.length >= PASSWORD_LENGTH && password.length >= PASSWORD_LENGTH
}

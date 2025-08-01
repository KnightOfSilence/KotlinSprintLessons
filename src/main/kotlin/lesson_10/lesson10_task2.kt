package lesson_10

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

    return login.length >= 4 && password.length >= 4
}

package lesson_5

const val SHIP_NAME = "Heart of Gold"
const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {

    println("Приветствуем Вас на борту нашего космического корабля $SHIP_NAME.\nВведите имя Вашей учетной записи.")
    val userLogin = readln()

    if (userLogin != USER_LOGIN) {
        println("Пройдите регистрацию.")
    } else {
        println("Введите пароль Вашей учетной записи.")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD) {
            println("Добро пожаловать на наш корабль $SHIP_NAME")
        }
    }
}
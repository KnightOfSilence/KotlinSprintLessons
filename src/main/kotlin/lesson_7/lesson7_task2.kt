package lesson_7

fun main() {

    var sms: Int?
    var auth: Int?

    do {
        sms = (1000..9999).random()
        println("Ваш код авторизации: $sms")

        println("Пожалуйста, введите код из смс")
        auth = readln().toInt()
    } while (auth != sms)

    println("Добро пожаловать!")
}
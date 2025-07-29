package lesson_7

fun main(){

    do {val sms = (1000..9999).random()
        println("Ваш код авторизации: $sms")

        println("Пожалуйста, введите код из смс")
        val auth = readln().toInt()}
        while (auth != sms)

    println("Добро пожаловать!")
}
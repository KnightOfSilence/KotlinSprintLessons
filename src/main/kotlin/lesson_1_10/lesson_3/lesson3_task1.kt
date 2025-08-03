package lesson_1_10.lesson_3

fun main() {

    val greetingDay = "Добрый день"
    val greetingEvening = "Добрый вечер"
    val userName = "Иван"
    var resGreeting = "$greetingDay, $userName!"

    println(resGreeting)

    resGreeting = "$greetingEvening, $userName!"

    println(resGreeting)
}
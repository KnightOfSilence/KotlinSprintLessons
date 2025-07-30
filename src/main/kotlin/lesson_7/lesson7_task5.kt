package lesson_7

fun main() {

    val variable = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var password = ""

    password += ('A'..'Z').random()
    password += ('a'..'z').random()
    password += ('0'..'9').random()

    println("Задайте длину пароля. Минимум 6 символов.")
    val length = readln().toInt()

    if (length >= 6) {
        for (i in length downTo 4) {
            password += variable.random()
        }
        println(password)
    } else println("Пароль слишком короткий")
}
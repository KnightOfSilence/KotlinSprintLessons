package lesson_7

fun main() {

    val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var passwordList = listOf<Char>()

    passwordList += ('A'..'Z').random()
    passwordList += ('a'..'z').random()
    passwordList += ('0'..'9').random()

    println("Задайте длину пароля. Минимум 6 символов.")
    val length = readln().toInt()

    if (length >= 6) {
        for (i in 4..length) {
            passwordList += allChars.random()
        }
        println(passwordList.shuffled().joinToString(""))
    } else println("Пароль слишком короткий")
}
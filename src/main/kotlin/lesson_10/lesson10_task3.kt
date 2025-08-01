package lesson_10

fun main() {

    println("Введите длину пароля")
    val length = readln().toInt()

    val password = passwordGenerator(length)
    println(password)
}
fun passwordGenerator(length: Int): String {

    val numbers = "0123456789"
    val symbols = "!\"#$%&'()*+,-./ "
    var res = ""

    for (i in 0 until length) {

        if (i % 2 == 0) res += numbers.random()
        else res += symbols.random()
    }

    return res
}
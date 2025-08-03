package lesson_1_10.lesson_10

const val LOGIN = "userpass"
const val PASSWORD = "qwerty"


fun main() {

    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val password = readln()

    val token1 = generateToken(login, password)

    getCart(token1)
}

fun generateToken(login: String, password: String): MutableList<String>? {
    if (login != LOGIN || password != PASSWORD) {
        return null
    } else {

        val chars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        val tokenList = mutableListOf<String>()

        for (i in 1..32) {
            tokenList.add(chars.random().toString())
        }
        return tokenList
    }
}

fun getCart(token1: MutableList<String>?) {

    val shopingCart = listOf("роутер", "кабель", "жесткий диск")

    if (token1 != null) {
       println(shopingCart.joinToString(", "))
    } else println("Авторизация не удалась!")
}


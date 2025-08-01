package lesson_10

import com.sun.imageio.plugins.common.I18N

const val LOGIN = "userpass"
const val PASSWORD = "qwerty"


fun main() {

    val shopingCart = listOf("роутер", "кабель", "жесткий диск")

    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val password = readln()

    val token1 = token(login, password)

    val getCart = getCart(token1)

    if (token1 != null) {
        println(shopingCart.joinToString(", "))
    } else println("Авторизация не удалась!")
}

fun token(login: String, password: String): MutableList<String>? {
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

fun getCart(token1:String){



}


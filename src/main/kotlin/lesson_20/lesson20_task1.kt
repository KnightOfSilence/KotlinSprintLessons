package lesson_20

val createGreetingMessage: (String) -> String = { username: String ->
    "С наступающим Новым Годом, $username!"
}

fun main() {
    val userName = "Чубайс))"
    val message = createGreetingMessage(userName)
    println(message)
}

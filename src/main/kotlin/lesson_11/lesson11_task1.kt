package lesson_11

class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String,
)
fun main() {

    val user1 = User(
        userId = 1,
        login = "login",
        password = "password123",
        email = "avt@mail.ru"
    )

    val user2 = User(
        userId = 2,
        login = "login",
        password = "qwerty",
        email = "dfgjfdhk@yandex.ru"
    )


    println("User1:")
    println(user1.userId)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println("User2:")
    println(user2.userId)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}

package lesson_11

class User2(
    val userId: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun userInfo() {
        println("ID: $userId")
        println("Логин: $login")
        println("Email: $email")
        println("Bio: $bio")
    }

    fun bio() {
        println("Расскажите о себе")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль:")
        val currentPassword = readln()

        if (currentPassword == password) {
            print("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен")
        }
    }
}

fun main() {

    val user = User2(
        userId = 3,
        login = "login",
        password = "password123",
        email = "hjgfjh@ya.ru"
    )
    user.bio()
    user.changePassword()

    println("Обновленная информация о пользователе:")
    user.userInfo()
}

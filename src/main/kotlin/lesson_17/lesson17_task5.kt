package lesson_17

class User(_login: String, _password: String) {
    var password = _password
        set(value) {
            println("Вы не можете изменить пароль.")
        }
        get()  = "*".repeat(field.length)

    var login = _login
        set(value) {
            if (value != field) {
                field = value
                println("Логин успешно изменен.")
            }
        }
}

fun main() {
    val newUser = User("admin", "qwerty")
    newUser.password = "newpassword"
    println(newUser.password)
    newUser.login = "newlogin"
    println(newUser.login)
}
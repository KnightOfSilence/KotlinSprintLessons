package lesson_17

class User(_login: String, _password: String) {
    var password = _password
        set(value) {
            if (value != field) println("Вы не можете изменить пароль.")
        }
        get() {
            var hiddenPassword = ""
            for (i in 1..field.length) hiddenPassword += "*"
            return hiddenPassword
        }
    var login = _login
        set(value) {
            if (value != field) println("Логин успешно изменен.")
        }
}

fun main() {
    val newUser = User("admin", "qwerty")
    newUser.password = "newpassword"
    println(newUser.password)
    newUser.login = "newlogin"
    println(newUser.login)
}
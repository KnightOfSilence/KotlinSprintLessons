package lesson_7

fun main(){

    val variable = "abcdefghijklnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"
    var password: String = ""

    println("Задайте длину пароля. Минимум 6 символов.")
    val len = readln().toInt()

    for (i in len downTo 1){

        password += variable.random()
    }

println(password)
}
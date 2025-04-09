package lesson_5

fun main() {
    println("Введите первое число")
    val num1 = readln().toInt()

    println("Введите второе число")
    val num2 = readln().toInt()

    println("Введите сумму двух чисел")
    val userAnswer = readln().toInt()
    val totalSum = num1 + num2

    val result = if (userAnswer == totalSum) "Добро пожаловать!" else "Доступ запрещен."
    println(result)
}
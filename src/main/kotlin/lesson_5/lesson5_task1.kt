package lesson_5

fun main() {
    val num1 = (0..50).random()
    val num2 = (0..50).random()

    println("Подтвердите, что вы не робот, сложите два числа: $num1 и $num2")
    val userAnswer = readln().toInt()
    val totalSum = num1 + num2

    val result = if (userAnswer == totalSum) "Добро пожаловать!" else "Доступ запрещен."
    println(result)
}
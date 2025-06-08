package lesson_5

import java.lang.String.format

fun main() {

    println("Введите ваш вес в килограммах.")
    val userWeight: Double = readln().toDouble()

    println("Введите ваш рост в сантиметрах.")
    val userHeight: Double = readln().toDouble() / 100

    val bmi = (userWeight / (userHeight * userHeight)).toDouble()

    println(format("%.2f", bmi))

    if (bmi < 18.5) {
        println("Недостаточная масса тела.")
    } else if (bmi in 18.5..<25.0) {
        println("Нормальная масса тела.")
    } else if (bmi in 25.0..<30.0) {
        println("Избыточная масса тела.")
    } else {
        println("Ожирение.")
    }
}

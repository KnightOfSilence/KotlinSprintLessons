package lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Round(private val radius: Int) {

    fun getCircumFerence() {

        val perimeter = 2 * PI * radius
        println("Периметр окружности: $perimeter")
    }

    fun getRoundSquare() {

        val square = PI * radius.toDouble().pow(2).toInt()
        println("Площадь окружности: $square")
    }
}

fun main() {

    val result = Round(15)
    result.getCircumFerence()
    result.getRoundSquare()
}
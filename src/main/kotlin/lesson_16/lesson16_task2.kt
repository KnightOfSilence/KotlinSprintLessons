package lesson_16

private const val PI = 3.14

class Round(val radius: Int) {

    fun circumFerence() {

        val perimeter = 2 * PI * radius
        println("Периметр окружности: $perimeter")
    }

    fun roundSquare() {

        val square = PI * radius * radius
        println("Площадь окружности: $square")
    }
}

fun main() {

    val res = Round(15)
    res.circumFerence()
    res.roundSquare()
}

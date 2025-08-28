package lesson_16

class Cube {

    private val cubeNumber = (1..6).random()

    fun rollDice() = println("Выпало число $cubeNumber")
}

fun main() {

    val result = Cube()
    result.rollDice()
}
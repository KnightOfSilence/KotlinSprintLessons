package lesson_16

class Cube {

    val cubeNumber = (1..6).random()

    fun isCubeNumber() = println("Выпало число $cubeNumber")
}

fun main() {

    val res = Cube()
    res.isCubeNumber()
}
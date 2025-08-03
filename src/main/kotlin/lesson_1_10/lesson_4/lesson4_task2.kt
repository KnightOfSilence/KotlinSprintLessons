package lesson_1_10.lesson_4

const val MINIMAL_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_LTRS = 100

fun main() {

    var weight = 20
    var volume = 80
    var comparison = (weight > MINIMAL_WEIGHT) && (weight <= MAX_WEIGHT) && (volume < MAX_LTRS)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $comparison")

    weight = 50
    volume = 100
    comparison = (weight > MINIMAL_WEIGHT) && (weight <= MAX_WEIGHT) && (volume < MAX_LTRS)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $comparison")
}
package lesson_4

const val MINIMAL_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_LTRS = 100

fun main() {

    val weight_1 = 20
    val volume_1 = 80
    val weight_2 = 50
    val volume_2 = 100
    val comparison_1: Boolean = weight_1 > MINIMAL_WEIGHT && weight_1 <= MAX_WEIGHT && volume_1 < MAX_LTRS
    val comparison_2: Boolean = weight_2 > MINIMAL_WEIGHT && weight_2 <= MAX_WEIGHT && volume_2 < MAX_LTRS

    println("Груз с весом $weight_1 кг и объемом $volume_1 л соответствует категории 'Average': $comparison_1")
    println("Груз с весом $weight_2 кг и объемом $volume_2 л соответствует категории 'Average': $comparison_2")
}
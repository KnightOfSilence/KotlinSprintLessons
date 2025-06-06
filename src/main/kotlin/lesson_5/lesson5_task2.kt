package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {

    val userBirthYear = readln().toInt()

    if ((CURRENT_YEAR - userBirthYear) >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}
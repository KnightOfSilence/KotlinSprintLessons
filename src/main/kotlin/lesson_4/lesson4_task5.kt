package lesson_4

const val FOOD_BOXES = 50
const val IS_CASE_DAMAGE = false
const val IS_WEATHER_GOOD = true
const val CREW_MIN = 55
const val CREW_MAX = 70

fun main() {

    println("Численность экипажа?")
    val crewNum = readln().toInt()

    println("Имеет ли корабль повреждения?")
    val damagedShip: Boolean = readln().toBoolean()

    println("Запас ящиков с провизией?")
    val foodBoxes = readln().toInt()

    println("Погода хорошая?")
    val weatherCondition = readln().toBoolean()
    val canStart = ((damagedShip == IS_CASE_DAMAGE)
            && (crewNum in CREW_MIN .. CREW_MAX)
            && (foodBoxes > FOOD_BOXES))
            || ((damagedShip != IS_CASE_DAMAGE)
            && (crewNum == CREW_MAX)
            && (foodBoxes > FOOD_BOXES)
            && (weatherCondition == IS_WEATHER_GOOD))
    println("Корабль готов к плаванию: $canStart")
}
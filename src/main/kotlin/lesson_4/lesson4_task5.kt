package lesson_4

const val FOOD_BOXES = 50
const val CREW_REQUIREMENT = 70
const val SHIP_UNDAMAGED = true
const val GOOD_WEATHER = true
const val SHIP_DAMAGED = true

fun main() {

    val crew = 55..70

    println("Численность экипажа?")
    val crewNum = readln().toInt()

    println("Имеет ли корабль повреждения?")
    val damagedShip: Boolean = readln().toBoolean()

    println("Запас ящиков с провизией?")
    val foodBoxes = readln().toInt()

    println("Погода хорошая?")
    val weatherCondition = readln().toBoolean()
    val startWithoutDamages = (damagedShip == SHIP_UNDAMAGED) && (crewNum in crew) && (foodBoxes > FOOD_BOXES)
    val startWithDamages = (damagedShip == SHIP_DAMAGED)
            && (crewNum == CREW_REQUIREMENT) && (foodBoxes > FOOD_BOXES)
            && (weatherCondition == GOOD_WEATHER)
    val result = "Корабль готов к плаванию: ${startWithDamages or startWithoutDamages}"
    println(result)
}

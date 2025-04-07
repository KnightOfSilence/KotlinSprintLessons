package lesson_4

const val SUNNY_WEATHER = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val TIME_OF_THE_YEAR = "зима"

fun main() {

    val isWeatherSunny = true
    val isTentOpen = true
    val airHmd = 20
    val timeOfTheYear = "зима"

    val res = isWeatherSunny == SUNNY_WEATHER && isTentOpen == TENT_IS_OPEN && airHmd == AIR_HUMIDITY
            && timeOfTheYear == TIME_OF_THE_YEAR
    println("Благоприятные ли условия сейчас для роста бобовых? $res")
}


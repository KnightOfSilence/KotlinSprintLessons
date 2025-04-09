package lesson_4

const val IS_WEATHER_SUNNY = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val TIME_OF_THE_YEAR = "зима"

fun main() {

    val isWeatherSunny = true
    val isTentOpen = true
    val airHmd = 20
    val timeOfTheYear = "зима"

    val res = isWeatherSunny == IS_WEATHER_SUNNY && isTentOpen == IS_TENT_OPEN && airHmd == AIR_HUMIDITY
            && timeOfTheYear != TIME_OF_THE_YEAR
    println("Благоприятные ли условия сейчас для роста бобовых? $res")
}


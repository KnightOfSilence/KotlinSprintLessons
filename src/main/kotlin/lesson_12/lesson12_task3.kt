package lesson_12


const val KELVIN_TO_CELSIUS = 273.15
class DailyWeather2(_dailyTemp: Int, _nightTemp: Int, _hasPrecipitation: Boolean) {

    val dailyTemp = _dailyTemp - KELVIN_TO_CELSIUS1
    val nightTemp = _nightTemp - KELVIN_TO_CELSIUS1
    val hasPrecipitation = _hasPrecipitation

    fun printWeather2() {
        println("Daily temperature: ${dailyTemp.format(2)} °C")
        println("Night temperature: ${nightTemp.format(2)} °C")
        println("Has precipitation: $hasPrecipitation")
    }
}

fun Double.format(digits: Int) = "%.${digits}f".format(this)

fun main() {
    val weather2 = DailyWeather2(280, 250, false)
    weather2.printWeather2()
}
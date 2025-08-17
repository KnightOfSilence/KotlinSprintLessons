package lesson_12


const val KELVIN_TO_CELSIUS1 = 273.15

class DailyWeather3(_dailyTemp: Int, _nightTemp: Int, _hasPrecipitation: Boolean) {

    val dailyTemp = _dailyTemp - KELVIN_TO_CELSIUS
    val nightTemp = _nightTemp - KELVIN_TO_CELSIUS
    val hasPrecipitation = _hasPrecipitation

    init {
        println("Daily temperature: ${dailyTemp.format(2)} °C")
        println("Night temperature: ${nightTemp.format(2)} °C")
        println("Has precipitation: $hasPrecipitation")

    }
}

fun Double.format1(digits: Int) = "%.${digits}f".format(this)

fun main() {
    val weather3 = DailyWeather3(280, 250, false)
}
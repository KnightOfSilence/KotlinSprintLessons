package lesson_12

import kotlin.random.Random
class DailyWeather4(
    val dayTemp: Int,
    val nightTemp: Int,
    val hasPrecipitation: Boolean,
)

fun generateDailyWeather4(): DailyWeather4 {
    val dayTemp = (-10..30).random()
    val nightTemp = (-10 .. 30).random()
    val hasPrecipitation = Random.nextBoolean()
    return DailyWeather4(dayTemp, nightTemp, hasPrecipitation)
}


fun main() {
    val weather4List = mutableListOf<DailyWeather4>()

    for (i in 1..30) {
        weather4List.add(generateDailyWeather4())
    }
    val averageDayTemperatures = (weather4List.map { it.dayTemp }).average()
    val averageNightTemperatures = (weather4List.map { it.nightTemp }).average()
    val precipitationDays = weather4List.count { it.hasPrecipitation }

    fun Double.format(digits: Int) = "%.${digits}f".format(this)

    println("Средняя дневная температура за месяц: ${averageDayTemperatures.format(2)} °C")
    println("Средняя ночная температура за месяц: ${averageNightTemperatures.format(2)} °C")
    println("Кол-во дней с осадками: $precipitationDays")
}
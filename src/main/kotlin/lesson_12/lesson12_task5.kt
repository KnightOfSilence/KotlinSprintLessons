package lesson_12

import kotlin.random.Random


class DailyWeather4(
    val dayTemp: Int,
    val nightTemp: Int,
    val hasPrecipitation: Boolean,
)

fun generateDailyWeather4(): DailyWeather4 {
    val dayTemp = Random.nextInt(-10, 30)
    val nightTemp = Random.nextInt(-10, 30)
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


}
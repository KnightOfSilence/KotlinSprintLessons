package lesson_15

abstract class WeatherStationStats(val stationStats: Double)

class TemperatureStats(temperature: Double) : WeatherStationStats(temperature)

class PrecipitationAmount(precipitation: Double) : WeatherStationStats(precipitation)

class WeatherServer {

    fun sendStats(stats: WeatherStationStats) {
        return if (stats is TemperatureStats) println("Температура ${stats.stationStats} °С.")
        else println("Кол-во осадков ${stats.stationStats} мм.")
    }
}

fun main() {

    val temperature = TemperatureStats(25.3)
    val precipitation = PrecipitationAmount(10.5)

    val weatherServer = WeatherServer()
    weatherServer.sendStats(temperature)

    val weatherServer2 = WeatherServer()
    weatherServer2.sendStats(precipitation)
}
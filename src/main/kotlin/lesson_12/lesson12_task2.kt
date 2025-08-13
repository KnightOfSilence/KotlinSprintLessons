package lesson_12


class DailyWeather1(_dailyTemp: Int, _nightTemp: Int, _hasPrecipitation: Boolean) {

    var dailyTemp = _dailyTemp
    var nightTemp = _nightTemp
    var hasPrecipitation = _hasPrecipitation

    fun printWeather1() {
        println("Daily temperature: $dailyTemp")
        println("Night temperature: $nightTemp")
        println("Has precipitation: $hasPrecipitation")
    }
}

fun main() {
    val weather1 = DailyWeather1(20, 5, true)
    println("Day1")
    weather1.printWeather1()

    println("Day2")
    val weather2 = DailyWeather1(30, 15, false)
    weather2.printWeather1()
}
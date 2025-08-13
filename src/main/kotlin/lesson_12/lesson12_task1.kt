package lesson_12

class DailyWeather() {

    var dailyTemp = 25
    var nightTemp = 10
    var hasPrecipitation = false

    fun printWeather() {
        println("Daily temperature: $dailyTemp")
        println("Night temperature: $nightTemp")
        println("Has precipitation: $hasPrecipitation")
    }
}

fun main() {
    val weather1 = DailyWeather()
    weather1.dailyTemp = 20
    weather1.nightTemp = 5
    weather1.hasPrecipitation = true
    weather1.printWeather()

    val weather2 = DailyWeather()
    weather2.dailyTemp = 30
    weather2.nightTemp = 15
    weather2.hasPrecipitation = false
    weather2.printWeather()
}
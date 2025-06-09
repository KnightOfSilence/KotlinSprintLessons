package lesson_5

fun main() {
    println("Расстояние поездки в километрах?")
    val userDist = readln().toDouble()
    println("Расход топлива на 100 км (в литрах)?")
    val fuelConsumption = readln().toDouble()
    println("Цена за литр топлива?")
    val fuelPrice = readln().toDouble()
    val fuelNeeded = (userDist * fuelConsumption) / 100
    val fuelTotalPrice = fuelNeeded * fuelPrice
    println("%.2f литров топлива необходимо для поезки.".format(fuelNeeded))
    println("%.2f рублей итоговая стоимость поездки".format(fuelTotalPrice))
}

package lesson_2

const val HUNDRED_PERCENT = 100

fun main() {

    val sumOfInvestment = 70000
    val percentPerYear = 16.7
    val totalInTwentyYears: Double
    val numOfYears: Double = 20.0
    val base = 1 + percentPerYear / HUNDRED_PERCENT

    totalInTwentyYears = sumOfInvestment * Math.pow(base, numOfYears)

    println(String.format("%.3f", totalInTwentyYears))
}
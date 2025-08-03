package lesson_1_10.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val startHour = 9
    val startMinutes = 39
    val timeOnRouteInMinutes = 457
    val timeInDistanceInHours: Int = timeOnRouteInMinutes / MINUTES_IN_HOUR
    val timeInDistanceInMinutes = timeOnRouteInMinutes % MINUTES_IN_HOUR
    val resHours = startHour + timeInDistanceInHours
    val resMinutes = startMinutes + timeInDistanceInMinutes
    val res = "17:16"

    println(resHours + 1)
    println(resMinutes - MINUTES_IN_HOUR)
    println(res)
}
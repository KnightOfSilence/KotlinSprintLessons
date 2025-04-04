package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val startHour = 9
    val startMinutes = 39
    val timeOnRouteInMinutes = 457
    val timeInDistanceInHours: Int
    val timeInDistanceInMinutes: Int
    val resHours: Int
    val resMinutes: Int
    val res = "17:16"

    timeInDistanceInHours = timeOnRouteInMinutes / MINUTES_IN_HOUR
    timeInDistanceInMinutes = timeOnRouteInMinutes % MINUTES_IN_HOUR
    resHours = startHour + timeInDistanceInHours
    resMinutes = startMinutes + timeInDistanceInMinutes

    println(resHours + 1)
    println(resMinutes - MINUTES_IN_HOUR)
    println(res)
}
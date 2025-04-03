package lesson_2

fun main() {
    val startHour = 9
    val startMinutes = 39
    val timeOnRouteInMinutes = 457
    val timeInDistanceInHours: Int = timeOnRouteInMinutes / 60
    val timeInDistanceInMinutes = timeOnRouteInMinutes % 60
    val resHours = startHour + timeInDistanceInHours
    val resMinutes = startMinutes + timeInDistanceInMinutes
    val res = "17:16"

    println(resHours + 1)
    println(resMinutes - 60)
    println(res)





}
package lesson_1_10.lesson_1

//Данные для задачи:
//Год полета – 1961
//Взлет – 09:07
//Посадка – 10:55

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val gagarinInSpaceInSec = 6480
    println(gagarinInSpaceInSec)
    val hours = gagarinInSpaceInSec / lesson_1_10.lesson_1.SECONDS_IN_HOUR
    val minutes = (gagarinInSpaceInSec - hours * lesson_1_10.lesson_1.SECONDS_IN_HOUR) / lesson_1_10.lesson_1.SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:00", hours, minutes))


}
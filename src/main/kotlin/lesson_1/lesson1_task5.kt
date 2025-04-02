package lesson_1

//Данные для задачи:
//Год полета – 1961
//Взлет – 09:07
//Посадка – 10:55

const val secondsInHour = 3600
const val secondsInMinute = 60

fun main() {
    val gagarinInSpaceInSec = 6480
    println(gagarinInSpaceInSec)
    val hours = gagarinInSpaceInSec / secondsInHour
    val minutes = (gagarinInSpaceInSec - hours * secondsInHour) / secondsInMinute
    println("0$hours:$minutes:00")

}
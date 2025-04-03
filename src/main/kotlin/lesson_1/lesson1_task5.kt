package lesson_1

//Данные для задачи:
//Год полета – 1961
//Взлет – 09:07
//Посадка – 10:55

const val SecondsInHour = 3600
const val SecondsInMinute = 60

fun main() {
    val gagarinInSpaceInSec = 6480
    println(gagarinInSpaceInSec)
    val hours = gagarinInSpaceInSec / SecondsInHour
    val minutes = (gagarinInSpaceInSec - hours * SecondsInHour) / SecondsInMinute
    println("0$hours:$minutes:00")

}
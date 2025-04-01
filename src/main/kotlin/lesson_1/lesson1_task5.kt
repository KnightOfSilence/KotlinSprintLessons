package lesson_1

//Данные для задачи:
//Год полета – 1961
//Взлет – 09:07
//Посадка – 10:55
fun main() {
    val gagarinInSpaceInSec = (10-9) * 3600 + (55 - 7) * 60
    println(gagarinInSpaceInSec)
    val hours = gagarinInSpaceInSec / 3600
    val minutes = (gagarinInSpaceInSec - hours * 3600) / 60
    println("0$hours:$minutes:00")

}
package lesson_6

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()
    var counter = seconds

    do {
        counter--
        Thread.sleep(1000)

    } while (counter > 0)

    println("Прошло $seconds секунд")
}
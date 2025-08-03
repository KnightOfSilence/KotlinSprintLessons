package lesson_1_10.lesson_6

fun main() {

    println("Введите количество секунд")
    var seconds = readln().toInt()

    while (seconds > 0) {

        println("Осталось секунд: $seconds")
        Thread.sleep(1000)
        seconds--
    }
    println("Время вышло")
}

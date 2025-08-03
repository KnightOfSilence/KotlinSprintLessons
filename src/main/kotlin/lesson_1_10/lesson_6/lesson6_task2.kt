package lesson_1_10.lesson_6

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toLong()
    Thread.sleep(seconds * 1000)
    println("Прошло $seconds секунд")
}
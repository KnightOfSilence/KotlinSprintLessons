package lesson_7

fun main() {

    println("Enter number")
    val num = readln().toInt()

    for (i in num downTo 1) {

        println(i)
        Thread.sleep(1000)

    }
    println("Время вышло")
}
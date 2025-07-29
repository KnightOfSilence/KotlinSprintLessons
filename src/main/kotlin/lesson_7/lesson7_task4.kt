package lesson_7
fun main() {

    println("Ведите число")
    val num = readln().toInt()

    for (i in num downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println()
    println("Время вышло")
}
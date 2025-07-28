package lesson_7

fun main() {

    println("Print your number")
    val num = readln().toInt()

    for (i in 0..num) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
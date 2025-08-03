package lesson_1_10.lesson_7

fun main() {

    println("Print your number")
    val num = readln().toInt()

    for (i in 0..num step 2) {
        println(i)
    }
}
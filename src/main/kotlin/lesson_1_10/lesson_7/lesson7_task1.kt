package lesson_1_10.lesson_7

fun main() {

    val strList = 'a'..'z'
    val numList = 0..9
    var res = ""

    for (i in 1..6) {
        if (i % 2 != 0) {
            res += strList.random()
        } else {
            res += numList.random()
        }

    }
    println(res)
}
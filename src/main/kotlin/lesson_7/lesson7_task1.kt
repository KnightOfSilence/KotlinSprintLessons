package lesson_7

import java.lang.Math.random

fun main() {

    var res: String = ""

    for (i in 1..6) {
        if (i % 2 != 0) {
            res += ('a'..'z').random()
        } else {
            res += (0..9).random()
        }

    }
    println(res)
}
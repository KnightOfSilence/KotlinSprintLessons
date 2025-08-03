package lesson_1_10.lesson_6

import java.lang.Math.random

fun main() {

    var counter = 3

    do {
        println("Решите задачу")
        val num1 = (1..9).random()
        val num2 = (1..9).random()
        println("$num1 + $num2")
        val res = readln().toInt()
        if (res == (num1 + num2)) {
            println("Добро пожаловать!")
            return
        } else {
            counter--
        }
    } while (counter > 0)
    println("Доступ запрещен")
}
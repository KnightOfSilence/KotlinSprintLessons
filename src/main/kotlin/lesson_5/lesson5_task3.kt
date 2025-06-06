package lesson_5

const val NUMBER_ONE = 31
const val NUMBER_TWO = 19

fun main() {

    println("Введите первое число от 0 до 42")
    val userFirstNum = readln().toInt()
    println("Введите второе число от 0 до 42")
    val userSecondNum = readln().toInt()

    if ((userFirstNum == NUMBER_ONE || userFirstNum == NUMBER_TWO) && (userSecondNum == NUMBER_ONE || userSecondNum == NUMBER_TWO)){
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if ((userFirstNum == NUMBER_ONE || userFirstNum == NUMBER_TWO) || (userSecondNum == NUMBER_ONE || userSecondNum == NUMBER_TWO)){
        println("Вы выиграли утешительный приз!")
    }
    else {
        println("Неудача!")
    }
    println("Выйгрышные числа $NUMBER_ONE и $NUMBER_TWO")
}
package lesson_5

fun main() {

    val number1 = (0..42).random()
    val number2 = (0..42).random()

    println("Введите первое число от 0 до 42")
    val userFirstNum = readln().toInt()
    println("Введите второе число от 0 до 42")
    val userSecondNum = readln().toInt()

    if ((userFirstNum == number1 || userFirstNum == number2) &&
        (userSecondNum == number1 || userSecondNum == number2)){
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if ((userFirstNum == number1 || userFirstNum == number2) ||
        (userSecondNum == number1 || userSecondNum == number2)){
        println("Вы выиграли утешительный приз!")
    }
    else {
        println("Неудача!")
    }
    println("Выйгрышные числа $number1 и $number2")
}
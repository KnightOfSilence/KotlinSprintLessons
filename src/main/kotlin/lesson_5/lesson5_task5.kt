package lesson_5

fun main() {

    val number1 = (0..42).random()
    val number2 = (0..42).random()
    val number3 = (0..42).random()
    val numberList = arrayListOf(number1, number2, number3)

    println("Введите первое число от 0 до 42")
    val userFirstNum = readln().toInt()
    println("Введите второе число от 0 до 42")
    val userSecondNum = readln().toInt()
    println("Введите третье число от 0 до 42")
    val userThirdNum = readln().toInt()
    val userNumberList = arrayListOf(userFirstNum, userSecondNum, userThirdNum)
    val equals = numberList.intersect(userNumberList)
    val equalsLength = equals.size

    when (equalsLength) {
        3 -> println("Вы угадали все числа и выйграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз.")
        1 -> println("Вы угадали одно число. Вам положен утешительный приз.")
        else -> println("Вы не угадали ни одного числа.")
    }
    println("Выйгрышные числа: $number1, $number2, $number3")
}


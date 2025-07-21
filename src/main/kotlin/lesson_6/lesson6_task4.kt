package lesson_6

fun main() {

    val num = (0..9).random()
    var counter = 5

    do {

        println("Введите число...")
        val digit = readln().toInt()

        if (digit == num) {
            println("Это была великолепная игра!")
            break
        } else {
            counter--
            println("Неверно! Осталось $counter попыток.")

        }} while (counter > 0)

    if (counter == 0){
        println("Было загадано число $num")
    }
}
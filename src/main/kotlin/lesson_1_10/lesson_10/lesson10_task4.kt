package lesson_1_10.lesson_10

fun main() {

    var userWins = 0
    var continueGame = true

    while (continueGame) {

        val userTurn: Int = lesson_1_10.lesson_10.rollingDice()
        println("У игрока выпало число $userTurn")
        val computerTurn: Int = lesson_1_10.lesson_10.rollingDice()
        println("У компьютера выпало число $computerTurn")

        if (userTurn > computerTurn) {
            println("Победило человечество")
            userWins++
        } else if (userTurn < computerTurn) println("Победила машина")
        else println("Победила дружба")

        continueGame = newRound()
    }

    println("Игра окончена. Вы выиграли $userWins раз.")
}

fun rollingDice(): Int {
    return (1..6).random()
}

fun newRound(): Boolean {

    println("Хотите сыграть еще раз? Введите Да или Нет: ")
    val userAnswer = readln().lowercase()

    return if (userAnswer == "да") true
    else false
}

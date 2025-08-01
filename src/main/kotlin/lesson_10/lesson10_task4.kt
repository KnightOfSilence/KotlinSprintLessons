package lesson_10

fun main() {

    var userWins = 0
    var continueGame = true

    while (continueGame) {

        val userTurn: Int = userRollingDice()
        println("У игрока выпало число $userTurn")
        val computerTurn: Int = computerRollingDice()
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

fun userRollingDice(): Int {
    return (1..6).random()
}

fun computerRollingDice(): Int {
    return (1..6).random()
}

fun newRound(): Boolean {

    println("Хотите сыграть еще раз? Введите Да или Нет: ")
    val userAnswer = readln().lowercase()

    if (userAnswer == "да") return true
    else return false
}

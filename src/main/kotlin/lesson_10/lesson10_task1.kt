package lesson_10

fun main() {

    val userTurn: Int = userRollingDice()
    println("У игрока выпало число $userTurn")
    val computerTurn: Int = computerRollingDice()
    println("У компьютера выпало число $computerTurn")

    if (userTurn > computerTurn) println("Победило человечество")
    else if (userTurn < computerTurn) println("Победила машина")
    else println("Победила дружба")
}

fun userRollingDice(): Int {
    return (1..6).random()
}

fun computerRollingDice(): Int {
    return (1..6).random()
}


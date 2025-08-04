package lesson_1_10.lesson_10

fun main() {

    val userTurn: Int = rollingDice1()
    println("У игрока выпало число $userTurn")
    val computerTurn: Int = rollingDice1()
    println("У компьютера выпало число $computerTurn")

    if (userTurn > computerTurn) println("Победило человечество")
    else if (userTurn < computerTurn) println("Победила машина")
    else println("Победила дружба")
}

fun rollingDice1(): Int {
    return (1..6).random()
}



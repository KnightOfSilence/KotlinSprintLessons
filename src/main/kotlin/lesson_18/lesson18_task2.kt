package lesson_18

const val minDiceValue = 1

open class Dice {
    open fun rollDice() = ""
}

class DiceOfFour(private val sides: Int = 4) : Dice() {
    override fun rollDice(): String {
        return "Выпало число ${(minDiceValue..sides).random()}"
    }
}

class DiceOfSix(private val sides: Int = 6) : Dice() {
    override fun rollDice(): String {
        return "Выпало число ${(minDiceValue..sides).random()}"
    }
}

class DiceOfEight(private val sides: Int = 8) : Dice() {
    override fun rollDice(): String {
        return "Выпало число ${(minDiceValue..sides).random()}"
    }
}

fun main() {
    val diceOfFour = DiceOfFour()
    val diceOfSix = DiceOfSix()
    val diceOfEight = DiceOfEight()
    val diceList = listOf(diceOfFour, diceOfSix, diceOfEight)
    diceList.forEach { println(it.rollDice()) }
}

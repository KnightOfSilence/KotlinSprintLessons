package lesson_18

const val minDiceValue = 1

abstract class Dice() {
    abstract val sides: Int
    open fun rollDice(): String {
        return "Выпало число ${(minDiceValue..sides).random()}"
    }
}

class DiceOfFour(override val sides: Int = 4) : Dice()
class DiceOfSix(override val sides: Int = 6) : Dice()

class DiceOfEight(override val sides: Int = 8) : Dice()

fun main() {
    val diceOfFour = DiceOfFour()
    val diceOfSix = DiceOfSix()
    val diceOfEight = DiceOfEight()
    val diceList = listOf(diceOfFour, diceOfSix, diceOfEight)
    diceList.forEach { println(it.rollDice()) }
}
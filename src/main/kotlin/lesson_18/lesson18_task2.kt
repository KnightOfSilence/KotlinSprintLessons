package lesson_18

const val minDiceValue = 1

open class Dice(private val sides: Int = 8) {
    open fun rollDice(): String {
        return "Выпало число ${(minDiceValue..sides).random()}"
    }
}

class DiceOfFour() : Dice(4)
class DiceOfSix() : Dice(6)

class DiceOfEight() : Dice(8)

fun main() {
    val diceOfFour = DiceOfFour()
    val diceOfSix = DiceOfSix()
    val diceOfEight = DiceOfEight()
    val diceList = listOf(diceOfFour, diceOfSix, diceOfEight)
    diceList.forEach { println(it.rollDice()) }
}

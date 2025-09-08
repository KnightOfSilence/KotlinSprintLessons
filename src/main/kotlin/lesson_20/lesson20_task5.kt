package lesson_20

class Robot {
    private val phrases = listOf(
        "Я робот и я люблю программировать",
        "Мой процессор работает на полную мощность",
        "Я могу помочь вам с задачами",
        "Моя батарея заряжена на 100%",
        "Я готов к новым приключениям"
    )

    private var modifier: (String) -> String = { it }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }

    fun say() {
        val randomPhrase = phrases.random()
        println(modifier(randomPhrase))
    }
}

val invertModifier: (String) -> String = { text ->
    text.split(" ").reversed().joinToString(" ")
}

fun main() {
    val robot = Robot()

    println("Робот говорит обычную фразу:")
    robot.say()

    println("\nУстанавливаем модификатор инвертирования слов...")
    robot.setModifier(invertModifier)

    println("\nРобот говорит с модификатором:")
    robot.say()
}

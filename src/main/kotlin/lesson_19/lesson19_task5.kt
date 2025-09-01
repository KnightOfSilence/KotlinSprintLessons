package lesson_19

enum class Gender {
    MALE,
    FEMALE;

    fun getDescription(): String {
        return when (this) {
            MALE -> "Мужской"
            FEMALE -> "Женский"
        }
    }
}

data class Person(
    val name: String,
    val gender: Gender
)

private fun showInstructions() {
    println("Добро пожаловать в приложение 'Картотека'!")
    println("Формат ввода данных:")
    println("- Введите имя человека")
    println("- Введите пол (M - мужской, F - женский)")
    println("Пример: ")
    println("  Имя: Иван")
    println("  Пол: M")
    println()
}

fun main() {
    showInstructions()

    val cardIndex = mutableListOf<Person>()

    for (i in 1..5) {
        println("\nВведите данные для человека №$i:")

        print("Имя: ")
        val name = readLine()?.trim() ?: ""

        print("Пол (M/F): ")
        val genderInput = readLine()?.trim()

        val gender = when (genderInput?.uppercase()) {
            "M" -> Gender.MALE
            "F" -> Gender.FEMALE
            else -> {
                println("Ошибка! Неверный формат пола. Используйте M или F")
                continue
            }
        }
        cardIndex.add(Person(name, gender))
    }

    println("\nКартотека:")
    cardIndex.forEachIndexed { index, person ->
        println("Запись №${index + 1}:")
        println("  Имя: ${person.name}")
        println("  Пол: ${person.gender.getDescription()}")
        println("------------------------")
    }
}



package lesson_1_10.lesson_9

fun main() {

    val baseList = mutableListOf("Яйца", "Молоко", "Хлеб")
    println("В рецепте есть базовые ингредиенты: $baseList")

    println("Желаете добавить еще?")
    val answer = readln()

    if (answer.equals("нет", ignoreCase = true)) {

        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        baseList.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $baseList")
    } else return
}
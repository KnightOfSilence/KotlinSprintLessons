package lesson_9

fun main() {

    println("Введите пять ингредиентов через запятую с пробелом:")
    val userInput = readln()
    val ingredientsList = userInput.split(", ")
    val sortedIngredientsList = ingredientsList.sorted()

    println("Следующие ингредиенты добавлены в список:")
    sortedIngredientsList.forEach{ println(it) }
}
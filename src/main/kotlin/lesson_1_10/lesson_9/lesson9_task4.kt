package lesson_1_10.lesson_9

fun main() {

    println("Введите пять ингредиентов через запятую с пробелом:")
    val userInput = readln()
    val ingredientsList = userInput.split(", ").sorted()

    println("Следующие ингредиенты добавлены в список:")
    ingredientsList.forEach{ println(it) }
}
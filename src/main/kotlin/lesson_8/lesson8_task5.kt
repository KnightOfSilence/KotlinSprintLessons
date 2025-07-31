package lesson_8

fun main() {
    println("Введите количество ингредиентов:")
    val numberOfIngredients = readln().toInt()

    val ingredients = Array(numberOfIngredients) { "" }

    for (i in ingredients.indices) {
        println("Введите ингредиент ${(i + 1)}:")
        ingredients[i] = readln()
    }

    println("Список ингредиентов:")
    println(ingredients.joinToString(", ", postfix = "."))
}


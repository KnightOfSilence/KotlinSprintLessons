package lesson_8

fun main() {
    println("Введите количество ингредиентов:")
    val numberOfIngredients = readln().toInt()

    val ingredients = arrayOfNulls<String>(numberOfIngredients)

    for (i in 0 until numberOfIngredients) {
        println("Введите ингредиент ${(i+1)}:")
        ingredients[i] = readln()
    }

    println("Список ингредиентов:")
    println(ingredients.joinToString(", ", postfix = "."))
}


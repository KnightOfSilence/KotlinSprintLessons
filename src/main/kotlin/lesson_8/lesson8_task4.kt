package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf(
        "Квас белый", "Картошка", "Яйцо",
        "Огурцы", "Говядина", "Редиска", "Зелень"
    )
    println(arrayOfIngredients.joinToString(", ", postfix = "."))

    println("Какой ингредиент вы хотите заменить?")
    val ingredient = readln()

    if (ingredient in arrayOfIngredients) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        arrayOfIngredients[arrayOfIngredients.indexOf(ingredient)] = newIngredient
        println("Готово! Вы сохранили следующий список:")
        println(arrayOfIngredients.joinToString(", ", postfix = "."))
        return
    }

    println("Такого ингредиента в рецепте нет")
}

package lesson_9

fun main() {

    val listOfIngredients = listOf(
        "Квас белый", "Картошка", "Яйцо",
        "Огурцы", "Говядина", "Редиска", "Зелень"
    )

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { println(it) }
}
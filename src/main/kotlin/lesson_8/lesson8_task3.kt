package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf(
        "Квас белый", "Картошка", "Яйцо",
        "Огурцы", "Говядина", "Редиска", "Зелень"
    )

    println("Введите интересующий вас ингредиент...")
    val ingredient = readln()

    if (ingredient in arrayOfIngredients) {
        println("Ингредиент $ingredient в рецепте есть")
        return
    }

    println("Такого ингредиента в рецепте нет")
}
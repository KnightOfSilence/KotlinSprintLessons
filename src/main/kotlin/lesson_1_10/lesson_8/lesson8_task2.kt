package lesson_1_10.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf(
        "Квас белый", "Картошка", "Яйцо",
        "Огурцы", "Говядина", "Редиска", "Зелень"
    )

    println("Введите интересующий вас ингредиент...")
    val ingredient = readln()

    for (i in arrayOfIngredients) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
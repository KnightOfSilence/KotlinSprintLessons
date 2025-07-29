package lesson_8

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
        } else {
            continue
        }
    }
    println("Такого ингредиента в рецепте нет")
}
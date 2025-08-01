package lesson_9

fun main() {

    var ingredientsList = mutableListOf<String>()

    for (i in 1..5) {
        println("Введите название ингредиента $i:")
        val userInput = readln()
        ingredientsList.add(userInput)
    }
    val ingredientsSet = ingredientsList.toSet()
    ingredientsList = ingredientsSet.toMutableList()
    val sortedIngredientsList = ingredientsList.sorted()
    val res = sortedIngredientsList.toMutableList()
    res[0] = res[0].capitalize()

    println(res.joinToString(", "))
}
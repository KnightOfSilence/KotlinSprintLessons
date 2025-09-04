package lesson_20

fun main() {

    val elements = listOf("Element1", "Element2", "Element3", "Element4", "Element5")

    val lambdas = elements.map { element -> { println("Нажат элемент: $element") } }

    for (i in lambdas.indices step 2) {
        lambdas[i]()
    }
}
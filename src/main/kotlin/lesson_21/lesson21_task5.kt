package lesson_21

fun Map<String, Int>.maxCategory(): String = (this.maxBy { it.value }).key

fun main() {

    val hero = mutableMapOf<String, Int>(
        Pair("Исцеление", 75), Pair("Сила", 35),
        Pair("Подвижность", 100), Pair("Интеллект", 50)
    )
    println(hero.maxCategory())
}
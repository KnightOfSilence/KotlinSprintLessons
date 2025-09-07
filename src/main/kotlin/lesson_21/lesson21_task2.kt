package lesson_21

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()

fun main() {
    val testList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenSum = testList.evenNumbersSum()
    println("Сумма четных чисел в списке: $evenSum")
}
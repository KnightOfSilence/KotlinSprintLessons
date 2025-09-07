package lesson_21

fun String.vowelCount() = this.count { it in "aeiouyAEIOUY" }

fun main() {
    val testString = "Hello Kotlin"
    val vowelCount = testString.vowelCount()
    println("Количество гласных в строке: $vowelCount")
}
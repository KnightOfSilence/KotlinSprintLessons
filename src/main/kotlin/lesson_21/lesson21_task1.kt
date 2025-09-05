package lesson_21

fun main() {
    fun String.vowelCount() = this.count { it in "aeiouyAEIOUY" }

    val testString = "Hello Kotlin"
    val vowelCount = testString.vowelCount()
    println("Количество гласных в строке: $vowelCount")
}

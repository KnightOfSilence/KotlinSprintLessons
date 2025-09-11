package lesson_22

data class NewDataook2(
    val title: String,
    val author: String,
    val numberOfPages: Int,
)

fun main() {

    val book = NewDataook2(
        title = "Книга",
        author = "Автор",
        numberOfPages = 200
    )

    val (title, author, numberOfPages) = book

    println("Название: $title")
    println("Автор: $author")
    println("Количество страниц: $numberOfPages")
}
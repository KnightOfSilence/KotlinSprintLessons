package lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("Книга 1", "Автор 1")
    val regularBook2 = RegularBook("Книга 1", "Автор 1")
    val dataBook1 = DataBook("Книга 1", "Автор 1")
    val dataBook2 = DataBook("Книга 1", "Автор 1")

    println("Сравнение RegularBook:")
    println("regularBook1 == regularBook2: ${regularBook1 == regularBook2}")
    println("regularbook1.equals(book2): ${regularBook1.equals(regularBook2)}")

    println("\nСравнение DataBook:")
    println("dataBook1 == dataBook2: ${dataBook1 == dataBook2}")
    println("dataBook1.equals(dataBook2): ${dataBook1.equals(dataBook2)}")

    // Объяснение разницы
    // При сравнении обычных классов (RegularBook) оператор == проверяет ссылки на объекты
    // Поэтому даже если содержимое объектов одинаковое, результат будет false

    // При сравнении data классов (DataBook) оператор == и метод equals()
    // автоматически генерируются компилятором и сравнивают значения всех полей
    // Поэтому результат будет true, если все поля совпадают
}
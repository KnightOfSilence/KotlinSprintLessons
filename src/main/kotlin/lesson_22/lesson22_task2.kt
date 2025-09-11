package lesson_22

class NewRegularClass(
    val title: String,
    val author: String,
)

data class NewDataClass(
    val title: String,
    val author: String,
)

fun main() {
    val newRegularClass = NewRegularClass("Книга", "Автор")
    val newDataClass = NewDataClass("Книга", "Автор")

    println(newRegularClass)
    println(newDataClass)

    // При выводе объекта обычного класса (NewRegularClass)
    // используется стандартный метод toString(),
    // который показывает имя класса и хэш-код объекта

    // При выводе объекта data class (NewDataClass)
    // автоматически генерируется информативный toString(),
    // который показывает все свойства объекта и их значения
}
package lesson_17

private const val HIDDEN_DOCUMENTS = "скрытая папка"
private const val NUMBER_OF_FILES = 0

class Folder(
    _name: String,
    _files: Int,
    var isSecret: Boolean,
) {
    val files = _files
        get() = if (isSecret) NUMBER_OF_FILES else field

    val name = _name
        get() = if (isSecret) HIDDEN_DOCUMENTS else field
}

fun main() {

    val myFiles = Folder("Избранное", 234, false)
    println(myFiles.name)
    println()
    myFiles.isSecret = true
    println("${myFiles.name}, количество файлов ${myFiles.files}")
    println()
    myFiles.isSecret = false
    println("${myFiles.name}, количество файлов ${myFiles.files}")
}
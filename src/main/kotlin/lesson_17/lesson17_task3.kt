package lesson_17

private const val HIDDEN_DOCUMENTS = "скрытая папка"
private const val NUMBER_OF_FILES = 0

class Package(
    _name: String,
    _files: Int,
    var isSecretFiles: Boolean,
) {
    val files = _files
        get() = if (isSecretFiles) NUMBER_OF_FILES else field

    val name = _name
        get() = if (isSecretFiles) HIDDEN_DOCUMENTS else "$field количество файлов $files"
}

fun main() {

    val myFiles = Package("Избранное", 234, false)
    println(myFiles.name)
    println()
    myFiles.isSecretFiles = true
    println("${myFiles.name} количество файлов ${myFiles.files}")
    println()
    myFiles.isSecretFiles = false
    println(myFiles.name)
}


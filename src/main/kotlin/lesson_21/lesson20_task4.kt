package lesson_21

import java.io.File

fun main() {

    fun File.writeToFile(text: String) {

        createNewFile()
        val userText = text.lowercase()
        val lines: MutableList<String> = this.readLines().toMutableList()
        lines.add(0, userText)
        writeText(lines.toString())

        val newFile = File("textFile")
        newFile.writeToFile("Text1")
        newFile.writeToFile("Text2")
    }
}
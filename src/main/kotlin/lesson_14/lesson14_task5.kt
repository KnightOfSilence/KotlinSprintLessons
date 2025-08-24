package lesson_14

import kotlin.random.Random

open class Message(
    val id: Int = Random.nextInt(),
    val author: String,
    val text: String,
) {
    override fun toString(): String = "[id: $id]$author: $text"
}

class ChildMessage(
    parentMessageId: Int,
    author: String,
    text: String,
) : Message(author = author, text = text) {
    val parentMessageId: Int = parentMessageId
}

class Chat {
    val messages = mutableListOf<Message>()
    var lastMessageId = 0

    fun addMessage(author: String, text: String) {
        val message = Message(author = author, text = text)
        messages.add(message)
        lastMessageId = message.id
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val childMessage = ChildMessage(parentMessageId, author, text)
        messages.add(childMessage)
    }

    fun printChat() {
        val groupedMessages =
            messages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }

        for ((parentMessageId, childMessages) in groupedMessages) {
            val parentMessage = messages.find { it.id == parentMessageId }
            if (parentMessage != null) {
                println(parentMessage)
                val childMessages = childMessages.sortedBy { it.id }
                childMessages.forEach { println(it) }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Иванов", "Привет!")
    chat.addThreadMessage(chat.lastMessageId, "Петров", "Приветствую!")
    chat.addMessage("Сидоров", "Как дела?")
    chat.addThreadMessage(chat.lastMessageId, "Иванов", "Хорошо, а у тебя?")
    chat.addThreadMessage(chat.lastMessageId, "Сидоров", "Что нового?")
    chat.printChat()
}


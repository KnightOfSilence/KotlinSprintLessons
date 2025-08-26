package lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
) {
    override fun toString(): String {
        return "$author: $text(id: $id)"
    }
}

class ChildMessage(
    val parentMessageId: Int,
    author: String,
    text: String,
    id: Int
) : Message(id, author, text)

class Chat {
    val messages = mutableListOf<Message>()
    var nextId = 0

    fun addMessage(author: String, text: String) {
        val message = Message(nextId++, author, text)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val childMessage = ChildMessage(parentMessageId, author, text, nextId++)
        messages.add(childMessage)
    }

    fun printChat() {
        val groupedMessages =
            messages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }

        for (message in messages) {
            if (message !is ChildMessage) {
                println(message)
                groupedMessages[message.id]?.forEach { childMessage -> println("\t $childMessage") }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Иванов", "Привет!")
    chat.addThreadMessage(0, "Петров", "Приветствую!")
    chat.addMessage("Сидоров", "Как дела?")
    chat.addThreadMessage(0, "Иванов", "Хорошо, а у тебя?")
    chat.addThreadMessage(0, "Сидоров", "Что нового?")
    chat.printChat()
}
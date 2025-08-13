package lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumPost(
    val authorId: Int,
    val message: String,
)

class Forum {
    var userId = 0
    val members = mutableMapOf<Int, ForumMember>()
    val messages = mutableListOf<ForumPost>()

    fun createNewUser(name: String): Int {
        userId++
        members[userId] = ForumMember(userId, name)
        return userId
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (members.containsKey(authorId)) {
            messages.add(ForumPost(authorId, message))
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = members[message.authorId]
            if (author != null) {
                println("${author.userName}: ${message.message}")
            }
        }

    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Вася")
    val user2 = forum.createNewUser("Петя")
    forum.createNewMessage(user1, "Привет всем!")
    forum.createNewMessage(user1, "Как дела?")
    forum.createNewMessage(user2, "Привет, Вася!")
    forum.createNewMessage(user2, "Отлично!")
    forum.printThread()
}

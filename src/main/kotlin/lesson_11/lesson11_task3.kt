package lesson_11

class User(
    val id: Int = 1,
    val nickname: String,
    val avatarUrl: String,
    var status: String = "микрофон выключен",
)

class ChatRoom(
    val title: String,
    val coverImageUrl: String,
    var users: MutableList<User> = mutableListOf(),
) {
    fun addUser(person: User) {
        if (person.id !in users.map { it.id }) {
            users.add(person)
            println("Участник ${person.nickname} добавлен в комнату")
        } else {
            println("Участник уже находится в комнате")
        }
    }

    fun userUpdateStatus(nickname: String, newStatus: String) {
        val userStatus = users.find { it.nickname == nickname }

        if (userStatus != null) {
            userStatus.status = newStatus
            println("Статус участника ${userStatus.nickname} обновлен на $newStatus")
        } else {
            println("Участник не найден")
        }
    }

    fun displayRoomInfo() {
        println("Комната: $title")
        println("Обложка: $coverImageUrl")
        println("Участники:")
        for (user in users) {
            println("${user.nickname} (${user.status}) - ${user.avatarUrl}")
        }
    }
}

fun main() {
    val user1 = User(
        nickname = "User1",
        avatarUrl = "https://pictures.com/avatar1.jpg",
    )

    val user2 = User(
        id = 2,
        nickname = "User2",
        avatarUrl = "https://pictures.com/avatar2.jpg",
    )

    val chatRoom = ChatRoom(
        title = "Комната обсуждения кода",
        coverImageUrl = "https://pictures.com/cover.jpg"
    )

    chatRoom.addUser(user1)
    chatRoom.addUser(user2)
    chatRoom.userUpdateStatus("User1", "разговаривает")
    chatRoom.displayRoomInfo()
}

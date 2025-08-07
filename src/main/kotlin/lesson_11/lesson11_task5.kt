package lesson_11


class ForumMember(
    val userId: Int?,
    val userName: String?,
    val nameList: List<String>,
    )
class ForumMemberBuilder {
    var userId: Int? = null
    var userName: String? = null
    var nameList = mutableListOf<String>()

    fun userId(value: Int) = apply { this.userId = value }
    fun userName(value: String) = apply { this.userName = value }
    fun addNameList(value: String) = apply { this.nameList.add(value) }
    fun build(): ForumMember {
        return ForumMember(userId, userName, nameList.toList())
    }


}
class ForumPost(
    val authorId: Int,
    val message: String,
)
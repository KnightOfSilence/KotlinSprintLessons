package lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
) {
    class ForumMemberBuilder(
        var userId: Int,
        var userName: String,
    ) {
        fun userId(value: Int) = apply { this.userId = value }
        fun userName(value: String) = apply { this.userName = value }
        fun build(): ForumMember {
            return ForumMember(userId, userName)
        }
    }
}

class ForumPost(
    val authorId: Int,
    val message: String,
) {
    class ForumPostBuilder(
        var authorId: Int,
        var message: String,
    ) {
        fun authorId(value: Int) = apply { this.authorId = value }
        fun message(value: String) = apply { this.message = value }
        fun build(): ForumPost {
            return ForumPost(authorId, message)
        }
    }
}
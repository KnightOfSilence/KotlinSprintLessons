package lesson_21

class NewPlayer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun main() {

    fun NewPlayer.isHealthy(): Boolean {
        return currentHealth == maxHealth
    }

    val player = NewPlayer("Герой", 50, 100)
    println(player.isHealthy())
}


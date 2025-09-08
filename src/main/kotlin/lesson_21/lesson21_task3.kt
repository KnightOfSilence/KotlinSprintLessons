package lesson_21

class NewPlayer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun NewPlayer.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player = NewPlayer("Герой", 50, 100)
    println(player.isHealthy())
}
package lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
) {
    fun showHealthStatus() {
        println("$name: текущее здоровье = $currentHealth / $maxHealth")
    }
}

val healingPotion: (player: Player) -> Unit = { player: Player ->
    println("Игрок выпил лечебное зелье!")
    player.currentHealth = player.maxHealth
}

fun main() {
    val player = Player(
        name = "Герой",
        currentHealth = 50,
        maxHealth = 100
    )

    println("До использования зелья:")
    player.showHealthStatus()
    healingPotion(player)
    println("После использования зелья:")
    player.showHealthStatus()
}
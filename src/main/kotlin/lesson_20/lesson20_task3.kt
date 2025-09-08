package lesson_20

class Player(
    val name: String,
    var hasKey: Boolean = false
) {
    fun showKeyStatus() {
        println("${name}: ${if (hasKey) "ключ есть" else "ключа нет"}")
    }

    fun findKey() {
        hasKey = true
        println("${name} нашёл ключ!")
    }
}

val checkDoor: (player: Player) -> String = { player: Player ->
    if (player.hasKey) {
        "Игрок открыл дверь"
    } else {
        "Дверь заперта"
    }
}

fun main() {
    val player = Player(name = "Герой")
    println("Начальная ситуация:")
    player.showKeyStatus()

    val result1 = checkDoor(player)
    println(result1)

    player.findKey()

    println("\nПосле нахождения ключа:")
    player.showKeyStatus()

    val result2 = checkDoor(player)
    println(result2)
}

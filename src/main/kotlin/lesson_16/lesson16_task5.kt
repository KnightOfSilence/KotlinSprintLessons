package lesson_16

class Player(
    private val name: String,
    private var health: Int = 100,
    var punchPower: Int = 20,
) {
    fun getHealth(): Int {
        return health
    }

    fun getDamage(damage: Int = 20): Int {
        if (health > 0) {
            health -= damage
            println("$name получил $damage урона. Осталось $health здоровья.")
        } else {
            death()
        }
        return health
    }

    fun heal(cure: Int = 20): Int {
        health += cure
        println("$name восстановился на $cure единиц здоровья. Осталось $health здоровья.")
       return health
    }

    private fun death() {
        println("$name умер.")
        health = 0
        punchPower = 0
    }
}

fun main() {
    val player1 = Player("Игрок 1", 100, 20)
    var counter = 0
    println("Игра началась.")

    while (player1.getHealth() > 0) {
        if (counter == 3) {
            player1.heal()
            counter = 0
        }
        player1.getDamage()
        counter += 1
    }
}
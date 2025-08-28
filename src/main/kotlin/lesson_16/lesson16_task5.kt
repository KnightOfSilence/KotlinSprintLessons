package lesson_16

class Player(
    val name: String,
    var health: Int = 100,
    var punchPower: Int = 20,
) {
    fun haveDamage(damage: Int = 20): Int {

        health -= damage
        println("$name получил $damage урона. Осталось $health здоровья.")
        return health
    }

    fun haveTreatment(cure: Int = 20): Int {
        println("$name восстановился на $cure единиц здоровья. Осталось $health здоровья.")
        return health + cure
    }

    private fun death() {
        println("$name умер.")
        health = 0
        punchPower = 0
    }

    fun userDeath() {
        death()
    }
}

fun main() {
    val player1 = Player("Игрок 1", 100, 20)
    var counter = 0
    println("Игра началась.")

    while (player1.health > 0) {
        if (counter == 3) {
            player1.haveTreatment()
            counter = 0
        }
        player1.haveDamage()
        counter += 1
    }
    player1.userDeath()
}
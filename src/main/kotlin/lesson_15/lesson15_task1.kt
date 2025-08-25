package lesson_15

interface Swimable {
    val name: String

    fun swim() = println("$name плавает.")
    fun swimDown() = println("$name погрузился.")
    fun swimUp() = println("$name всплыл.")
    fun swimBack() = println("$name плывет назад.")
    fun swimForward() = println("$name плывет вперед.")
}

interface Flyable {
    val name: String

    fun fly() = println("$name летит.")
    fun flyDown() = println("$name снижается.")
    fun flyUp() = println("$name взлетает.")
    fun landOnTheWater() = println("$name садится на воду.")
    fun diveIntoTheWater() = println("$name ныряет.")
}

class Fish(override val name: String) : Swimable
class Bird(override val name: String) : Flyable, Swimable

fun main() {

    val crucianCarp = Fish("карась")
    crucianCarp.swim()
    crucianCarp.swimDown()
    crucianCarp.swimUp()
    crucianCarp.swimBack()
    crucianCarp.swimForward()
    println()

    val seagull = Bird("чайка")
    seagull.fly()
    seagull.flyDown()
    seagull.flyUp()
    seagull.landOnTheWater()
    seagull.diveIntoTheWater()
    seagull.swim()
    println()

    val duck = Bird("утка")
    duck.fly()
    duck.flyDown()
    duck.flyUp()
    duck.landOnTheWater()
    duck.diveIntoTheWater()
    duck.swim()
    println()
}
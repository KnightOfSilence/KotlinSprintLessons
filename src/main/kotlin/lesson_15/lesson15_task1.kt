package lesson_15

interface Swimmable {
    val name: String

    fun swimUnderTheWater()
    fun swimDown()
    fun swimUp()
    fun swimBack()
    fun swimForward()
}

interface Flyable {
    val name: String

    fun fly()
    fun flyDown()
    fun flyUp()
    fun landOnTheWater()
    fun diveIntoTheWater()
    fun swimOnTheWater()
}

class Fish(override val name: String) : Swimmable {

    override fun swimUnderTheWater() = println("$name плавает в воде.")
    override fun swimDown() = println("$name погрузился.")
    override fun swimUp() = println("$name всплыл.")
    override fun swimBack() = println("$name плывет назад.")
    override fun swimForward() = println("$name плывет вперед.")
}

class Bird(override val name: String) : Flyable {

    override fun fly() = println("$name летит.")
    override fun flyDown() = println("$name снижается.")
    override fun flyUp() = println("$name взлетает.")
    override fun landOnTheWater() = println("$name садится на воду.")
    override fun diveIntoTheWater() = println("$name ныряет.")
    override fun swimOnTheWater() = println("$name плавает на поверхности воды.")
}

class Duck(override val name: String) : Flyable{
    override fun fly() = println("$name летит.")
    override fun flyDown() = println("$name снижается.")
    override fun flyUp() = println("$name взлетает.")
    override fun landOnTheWater() = println("$name садится на воду.")
    override fun diveIntoTheWater() = println("$name ныряет.")
    override fun swimOnTheWater() = println("$name плавает на поверхности воды.")
}

fun main() {

    val crucianCarp = Fish("карась")
    crucianCarp.swimUnderTheWater()
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
    seagull.swimOnTheWater()
    println()

    val duck = Duck("утка")
    duck.fly()
    duck.flyDown()
    duck.flyUp()
    duck.landOnTheWater()
    duck.diveIntoTheWater()
    duck.swimOnTheWater()
    println()
}
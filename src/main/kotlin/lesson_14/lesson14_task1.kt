package lesson_14


open class LinerShip(
    open val name: String = "Лайнер",
    open val speed: Int = 20,
    open val tonnage: Int = 100000,
    open val passengersCapacity: Int = 6000,
) {
    open fun showShipInfo() {
        println(
            """
                Тип судна: $name
                Скорость судна: $speed узлов
                Тоннаж судна: $tonnage тонн
                Человек на борту: $passengersCapacity
            """.trimIndent()
        )
    }
}

class CargoShip(
    override val name: String = "Грузовое судно",
    override val speed: Int = 20,
    override val tonnage: Int = 50000,
    override val passengersCapacity: Int = 60,
) : LinerShip(name, speed, tonnage, passengersCapacity)

class IceBreakerLiner(
    override val name: String = "Ледокольное судно",
    override val speed: Int = 10,
    override val tonnage: Int = 15000,
    override val passengersCapacity: Int = 50,
    val isIceBreaker: Boolean = true,
) : LinerShip(name, speed, tonnage, passengersCapacity) {
    override fun showShipInfo() {
        super.showShipInfo()
        println("Возможность колоть лед: $isIceBreaker")
    }
}

fun main() {

    val liner = LinerShip()
    liner.showShipInfo()
    println()

    val cargoShip = CargoShip()
    cargoShip.showShipInfo()
    println()

    val iceBreakerLiner = IceBreakerLiner()
    iceBreakerLiner.showShipInfo()
}


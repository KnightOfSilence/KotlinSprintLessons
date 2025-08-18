package lesson_14


open class CargoShip(
    val name: String = "Грузовое судно",
    val speed: Int = 20,
    val tonnage: Int = 50000,
    val passengersNum: Int = 60,
) {
    open fun ShipInfo() {
        println(
            """
                Тип судна: $name
                Скорость судна: $speed узлов
                Тоннаж судна: $tonnage тонн
                Человек на борту: $passengersNum
            """.trimIndent()
        )
    }
}

class IceBreakerLiner(
    name: String = "Ледокольное судно",
    speed: Int = 10,
    tonnage: Int = 15000,
    passengersNum: Int = 50,
    val isIceBreaker: Boolean = true,
) : CargoShip(name, speed, tonnage, passengersNum) {
    override fun ShipInfo() {
        super.ShipInfo()
        println(isIceBreaker)
    }
}


class LinerShip(
    name: String = "Лайнер",
    speed: Int = 20,
    tonnage: Int = 100000,
    passengersNum: Int = 6000,
) : CargoShip(name, speed, tonnage, passengersNum)

fun main() {

    val cargoShip = CargoShip()
    cargoShip.ShipInfo()

    val iceBreakerLiner = IceBreakerLiner()
    iceBreakerLiner.ShipInfo()

    val liner = LinerShip()
    liner.ShipInfo()
}


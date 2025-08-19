package lesson_14


open class LinerShip2(
    open val name: String = "Лайнер",
    open val speed: Int = 20,
    open val tonnage: Int = 100000,
    open val passengersCapacity: Int = 6000,
) {
    open fun showShipInfo2() {
        println(
            """
                Тип судна: $name
                Скорость судна: $speed узлов
                Тоннаж судна: $tonnage тонн
                Человек на борту: $passengersCapacity
            """.trimIndent()
        )
    }

    open fun shippingMethod() {
        println("Выдвинут горизонтальный трап со шкафута.")
    }
}

class CargoShip2(
    override val name: String = "Грузовое судно",
    override val speed: Int = 20,
    override val tonnage: Int = 50000,
    override val passengersCapacity: Int = 60,
) : LinerShip2(name, speed, tonnage, passengersCapacity) {

    override fun shippingMethod() {
        println("Активирован погрузочный кран.")
    }
}

class IceBreakerLiner2(
    override val name: String = "Ледокольное судно",
    override val speed: Int = 10,
    override val tonnage: Int = 15000,
    override val passengersCapacity: Int = 50,
    val isIceBreaker: Boolean = true,
) : LinerShip2(name, speed, tonnage, passengersCapacity) {
    override fun showShipInfo2() {
        super.showShipInfo2()
        println("Возможность колоть лед: $isIceBreaker")
    }

    override fun shippingMethod() {
        println("Открыты ворота со стороны кормы.")
    }
}

fun main() {

    val liner = LinerShip2()
    liner.showShipInfo2()
    liner.shippingMethod()
    println()

    val cargoShip = CargoShip2()
    cargoShip.showShipInfo2()
    cargoShip.shippingMethod()
    println()

    val iceBreakerLiner = IceBreakerLiner2()
    iceBreakerLiner.showShipInfo2()
    iceBreakerLiner.shippingMethod()
}


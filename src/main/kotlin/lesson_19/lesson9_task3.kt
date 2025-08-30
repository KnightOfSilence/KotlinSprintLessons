package lesson_19

open class SpaceShip {

    fun takeOff() {
        println("Корабль взлетел")
    }

    fun land() {
        TODO("Здесь будет логика посадки корабля")
    }

    fun shootAsteroid() {
        throw NotImplementedError("Функция пока не реализована")
    }
}

fun main() {
    val ship = SpaceShip()
    ship.takeOff()
    ship.land()
    ship.shootAsteroid()
}
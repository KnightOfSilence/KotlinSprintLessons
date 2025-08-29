package lesson_17

class Ship(
    _name: String,
    val averageSpeed: Int,
    val homePort: String,
) {
    var name = _name
        set(value) {
            println("Название судна изменять нельзя!")
        }
}

fun main() {
    val newShip = Ship("Titanic", 10, "Southampton")
    newShip.name = "Queen Mary"
    println(newShip.name)
}
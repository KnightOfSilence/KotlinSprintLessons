package lesson_17

class Ship(
    _name: String,
    val averageSpeed: Int,
    val homePort: String,
) {
    var name = _name
        set(value) {
            if (value != field) {
                println("Название судна изменять нельзя!")
            }
            field = value
        }
}
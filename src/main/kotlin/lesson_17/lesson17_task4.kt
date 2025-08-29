package lesson_17

private class Package(
    val trackingNumber: Int,
    _currentLocation: String,
    var movementCounter: Int = 0
) {

    var currentLocation = _currentLocation
        set(value) {
            if (field != value) {
                movementCounter += 1
                field = value
            }
        }
}

fun main(){
    val newPackage = Package(123456, "г.Москва")
    println("Посылка с номером ${newPackage.trackingNumber} находится в " +
            "${newPackage.currentLocation}. Количество перемещений: ${newPackage.movementCounter}")
    newPackage.currentLocation = "г.Санкт-Петербург"
    println("Посылка с номером ${newPackage.trackingNumber} находится в " +
            "${newPackage.currentLocation}. Количество перемещений: ${newPackage.movementCounter}")
}
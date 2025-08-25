package lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int
    val currentPassengers: Int

    fun loadPassengers(count: Int)
    fun unloadPassengers(count: Int)
}

interface CargoTransport {
    val maxCargoWeight: Int
    val currentCargoWeight: Int

    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)
}

class Truck(val name: String) : Movable, PassengerTransport, CargoTransport {
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0

    override val maxCargoWeight: Int = 2
    override var currentCargoWeight: Int = 0

    override fun move() {
        if (currentPassengers > 0 || currentCargoWeight > 0) {
            println("Грузовик $name перевозит груз и пассажиров.")
        } else {
            println("Грузовик $name едет пустой.")
        }
    }

    override fun loadPassengers(count: Int) {
        val availableSpace = maxPassengers - currentPassengers
        if (count <= availableSpace) {
            currentPassengers += count
            println("В грузовик $name сел $count пассажир(а). Всего в машине $currentPassengers пассажиров.")
        } else {
            println("Не удалось посадить $count пассажир(ов) в грузовик $name. Нет мест.")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (count <= currentPassengers) {
            currentPassengers -= count
            println("Из грузовика $name высадилось $count пассажир(а). Всего в машине осталось $currentPassengers пассажиров.")
        } else {
            println("$count пассажиров нет в грузовике $name")
        }
    }

    override fun loadCargo(weight: Int) {
        val availableCapacity = maxCargoWeight - currentCargoWeight
        if (weight <= availableCapacity) {
            currentCargoWeight += weight
            println("В грузовик $name загружен груз весом $weight тн. Всего в грузовике $currentCargoWeight тн.")
        } else {
            println("Не удалось загрузить груз весом $weight тн. В грузовике $name не хватает места.")
        }
    }

    override fun unloadCargo(weight: Int) {
        if (weight <= currentCargoWeight) {
            currentCargoWeight -= weight
            println("Из грузовика $name выгружен груз весом $weight тн. Всего в грузовике осталось $currentCargoWeight тн.")
        } else {
            println("В грузовике $name нет$weight тн груза.")
        }
    }
}

class Car(val name: String) : Movable, PassengerTransport {

    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun move() {
        if (currentPassengers > 0) {
            println("Машина $name едет с пассажирами.")
        } else {
            println("Машина $name едет без пассажиров.")
        }
    }

    override fun loadPassengers(count: Int) {
        val availableSpace = maxPassengers - currentPassengers
        if (count <= availableSpace) {
            currentPassengers += count
            println("В машину $name сел $count пассажир(а). Всего в машине $currentPassengers пассажиров.")
        } else {
            println("Не удалось посадить $count пассажир(ов) в машину $name. Нет мест.")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (count <= currentPassengers) {
            currentPassengers -= count
            println("Из машины $name высадилось $count пассажир(а). Всего в машине осталось $currentPassengers пассажиров.")
        } else {
            println("$count пассажиров нет в грузовике $name")
        }
    }
}

fun main() {
    val truck = Truck("Камаз")
    val car = Car("БМВ")
    val car2 = Car("Москвич")

    truck.loadCargo(2)
    truck.loadPassengers(1)
    truck.move()
    truck.unloadPassengers(1)
    truck.unloadCargo(2)

    car.loadPassengers(3)
    car.move()
    car.unloadPassengers(3)

    car2.loadPassengers(2)
    car2.move()
    car2.unloadPassengers(2)

    println()
    println("Перевозка завершена.")
}

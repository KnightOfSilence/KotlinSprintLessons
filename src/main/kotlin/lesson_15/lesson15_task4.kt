package lesson_15

interface Searchable {
    fun searchForComponents()
}

abstract class Product{
    abstract val name: String
    abstract val quantity: Int
}

class Instrument(
    override val name: String,
    override val quantity: Int,
) : Product(), Searchable {
    override fun searchForComponents() {
        println("Выполняется поиск аксессуаров для $name")
    }
}

class Components(
    override val name: String,
    override val quantity: Int,
) : Product()

fun main() {
    val instrument = Instrument("Гитара", 5)
    val components = Components("Блок питания", 10)
    instrument.searchForComponents()
    println("${instrument.name}, количество на складе: ${instrument.quantity}")
    println("${components.name}, количество на складе: ${components.quantity}")
}
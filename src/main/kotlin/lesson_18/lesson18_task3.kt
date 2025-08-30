package lesson_18

abstract class Animal {
    abstract val name: String
    abstract val food: String

    fun sleep() = "спит"
    fun eat(): String {
        return "$name ест $food"
    }
}

class Fox(override val name: String, override val food: String) : Animal()

class Dog(override val name: String, override val food: String) : Animal()

class Cat(override val name: String, override val food: String) : Animal()

fun main() {
    val fox = Fox("Лиса", "ягоды")
    val dog = Dog("Собака", "кости")
    val cat = Cat("Кошка", "рыбу")
    val animals = listOf<Animal>(fox, dog, cat)
    animals.forEach { println(it.eat()) }
}
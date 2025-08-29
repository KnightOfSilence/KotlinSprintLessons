package lesson_18

open class Animal {
    open fun sleep() = "спит"
    open fun eat() = "ест"
}

class Fox(private val name: String, private val food: String) : Animal() {
    override fun eat(): String {
        return "$name ест $food"
    }
}

class Dog(private val name: String, private val food: String) : Animal() {
    override fun eat(): String {
        return "$name ест $food"
    }
}

class Cat(private val name: String, private val food: String) : Animal() {
    override fun eat(): String {
        return "$name ест $food"
    }
}

fun main(){
    val fox = Fox("Лиса", "ягоды")
    val dog = Dog("Собака", "кости")
    val cat = Cat("Кошка", "рыбу")
    val animals = listOf<Animal>(fox, dog, cat)
    animals.forEach { println(it.eat())}
}
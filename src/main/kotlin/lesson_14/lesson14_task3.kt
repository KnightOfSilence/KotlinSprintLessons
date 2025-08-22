package lesson_14

import kotlin.math.roundToLong

abstract class Figure {
    abstract val color: String
    abstract fun calculateSquare(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(private val radius: Double, override val color: String) : Figure() {

    override fun calculateSquare(): Double {
        val result = Math.PI * radius * radius
        println("Площадь круга: $result")
        return result
    }

    override fun calculatePerimeter(): Double {
        val result = 2 * Math.PI * radius
        println("Периметр круга: $result")
        return result
    }
}

class Rectangle(private val length: Double, private val width: Double, override val color: String) :
    Figure() {
    override fun calculateSquare(): Double {
        val result = length * width
        println("Площадь прямоугольника: $result")
        return result
    }

    override fun calculatePerimeter(): Double {
        val result = 2 * (length + width)
        println("Периметр прямоугольника: $result")
        return result
    }
}

const val COLOR_WHITE = "белый"
const val COLOR_BLACK = "черный"


fun main() {
    val circle1 = Circle(5.0, COLOR_BLACK)
    circle1.calculatePerimeter()
    circle1.calculateSquare()
    println()
    val circle2 = Circle(10.0, COLOR_WHITE)
    circle2.calculatePerimeter()
    circle2.calculateSquare()
    println()
    val rectangle1 = Rectangle(4.0, 6.0, COLOR_BLACK)
    rectangle1.calculatePerimeter()
    rectangle1.calculateSquare()
    println()
    val rectangle2 = Rectangle(5.0, 10.0, COLOR_WHITE)
    rectangle2.calculatePerimeter()
    rectangle2.calculateSquare()
    println()

    val listOfFigures = listOf(circle1, circle2, rectangle1, rectangle2)
    var totalSquare = 0.0
    var totalPerimeter = 0.0

    listOfFigures.filter { it.color == COLOR_BLACK }
        .forEach { totalPerimeter += it.calculatePerimeter() }
    listOfFigures.filter { it.color == COLOR_WHITE }.forEach { totalSquare += it.calculateSquare() }

    println("Сумма периметров: ${totalPerimeter.roundToLong()}")
    println("Общая площадь: ${totalSquare.roundToLong()}")
}
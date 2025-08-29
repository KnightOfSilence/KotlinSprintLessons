package lesson_18

import kotlin.math.pow

open class Box {
    open fun getBoxArea() = 0.0
}

class CubeBox(private val side: Double) : Box() {
    override fun getBoxArea(): Double {
        return 6 * side.pow(2)
    }
}

class RectangleBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun getBoxArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}


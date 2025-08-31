package lesson_18

class Screen {

    fun draw(x: Int, y: Int): String {
        return "Нарисована точка в координатах (x=$x, y=$y)"
    }

    fun draw(x: Float, y: Float): String {
        return "Нарисована точка в координатах (x=$x, y=$y)"
    }

    fun draw(x: Int, y: Int, side: Int): String {
        return "Нарисован квадрат со стороной $side в координатах (x=$x, y=$y)"
    }

    fun draw(x: Float, y: Float, side: Float): String {
        return "Нарисован квадрат со стороной $side в координатах (x=$x, y=$y)"
    }

    fun draw(x: Int, y: Int, radius: Double): String {
        return "Нарисован круг с радиусом $radius в координатах (x=$x, y=$y)"
    }

    fun draw(x: Float, y: Float, radius: Double): String {
        return "Нарисован круг с радиусом $radius в координатах (x=$x, y=$y)"
    }
}

fun main() {
    val screen = Screen()

    println("--- Рисование с Int координатами ---")
    println(screen.draw(10, 20))
    println(screen.draw(30, 40, 5))
    println(screen.draw(50, 60, 7.5))

    println("\n--- Рисование с Float координатами ---")
    println(screen.draw(15.5f, 25.5f))
    println(screen.draw(35.0f, 45.2f, 5.8f))
    println(screen.draw(55.9f, 65.1f, 8.0))
}
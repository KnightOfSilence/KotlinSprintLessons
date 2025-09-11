package lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: String,
    val distanceFromEarthLightYears: Double,
)

fun main() {

    val galacticGuide = GalacticGuide(
        name = "Проксима Центавра",
        description = "Ближайшая к Земле звезда после Солнца",
        eventDateTime = "12:00:00 11-09-2025",
        distanceFromEarthLightYears = 4.37,
    )
    println("--- Информация из Путеводителя ---")
    println("Название: ${galacticGuide.component1()}")
    println("Описание: ${galacticGuide.component2()}")
    println("Дата и время события: ${galacticGuide.component3()}")
    println("Расстояние: ${galacticGuide.component4()} световых лет")
    println("---------------------------------")

}
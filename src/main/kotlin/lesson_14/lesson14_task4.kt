package lesson_14

open class SolarSystem(
    val name: String,
    val hasAtmosphere: Boolean,
    val isGoodForLanding: Boolean,
) {
    open fun displayInfo() {
        println(
            """            
            Название планеты: $name
            Наличие атмосферы: ${if (hasAtmosphere) "да" else "нет"}
            Возможность высадки на поверхность: ${if (isGoodForLanding) "да" else "нет"}          
            """.trimIndent()
        )
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isGoodForLanding: Boolean,
) : SolarSystem(name, hasAtmosphere, isGoodForLanding) {
    val satellites = mutableListOf<Satellite>()
    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Спутники:")
        if (satellites.isEmpty()) {
            println("Нет спутников")
        } else {
            for (satellite in satellites) {
                println("- ${satellite.name}")
            }
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isGoodForLanding: Boolean,
) : SolarSystem(name, hasAtmosphere, isGoodForLanding)

fun main() {
    val saturn = Planet("Сатурн", true, false)
    val titan = Satellite("Титан", true, true)
    val enceladus = Satellite("Энцелад", true, true)
    saturn.addSatellite(titan)
    saturn.addSatellite(enceladus)
    saturn.displayInfo()
}

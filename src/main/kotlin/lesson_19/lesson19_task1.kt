package lesson_19

enum class AquariumFish {
    ГУППИ,
    СКАЛЯРИЯ,
    ЗОЛОТАЯ_РЫБКА,
    ПЕТУШОК,
}

fun snowFishNames() {
    for (fish in AquariumFish.entries) {
        println(fish)
    }
}

fun main() {
    println("Аквариумные рыбки:")
    snowFishNames()
}
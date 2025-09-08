package lesson_19

enum class AquariumFish(var nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Сколярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun snowFishNames() {
    for (fish in AquariumFish.entries) {
        println(fish.nameFish)
    }
}

fun main() {
    println("Аквариумные рыбки:")
    snowFishNames()
}
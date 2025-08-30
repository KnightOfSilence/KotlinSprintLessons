package lesson_19

enum class AquariumFish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
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
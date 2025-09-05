package lesson_19

enum class Ammunition(val damage: Int? = null) {
    BLUE(5), GREEN(10), RED(20),
}

class Tank {
    private var ammunition: Ammunition? = null
    fun weaponLoad(ammo: Ammunition) {
        ammunition = ammo
        println("Заряжен ${ammo.name} снаряд с уроном ${ammo.damage}.")
    }

    fun shotFire() {
        if (ammunition == null) {
            println("Не заряжен.")
        } else {
            println("Произведен выстрел с уроном ${ammunition!!.damage}")
        }
    }
}

fun main() {
    val tank = Tank()
    println(tank.weaponLoad(Ammunition.BLUE))
    tank.shotFire()
    println(tank.weaponLoad(Ammunition.GREEN))
    tank.shotFire()
    println(tank.weaponLoad(Ammunition.RED))
    tank.shotFire()
}
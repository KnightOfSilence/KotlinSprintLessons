package lesson_19

enum class Ammunition(val damage: Int? = null) {
    BLUE(5), GREEN(10), RED(20),
}

class Tank(name: String, private var ammunition: Ammunition? = null) {
    fun weaponLoad(ammunition: Ammunition): String {
        when (ammunition) {
            Ammunition.BLUE -> return "Заряжен ${Ammunition.BLUE} снаряд с уроном ${Ammunition.BLUE.damage}."
            Ammunition.GREEN -> return "Заряжен ${Ammunition.GREEN} снаряд с уроном ${Ammunition.GREEN.damage}."
            Ammunition.RED -> return "Заряжен ${Ammunition.RED} снаряд с уроном ${Ammunition.RED.damage}."
        }
    }


    fun shotFire(damage: Int?) {
        if (damage == null) println("Не заряжен.") else println("Произведен выстрел с уроном $damage")
    }
}

fun main() {
    val tank = Tank("Т-34")
    println(tank.weaponLoad(Ammunition.BLUE))
    tank.shotFire(Ammunition.BLUE.damage)
    println(tank.weaponLoad(Ammunition.GREEN))
    tank.shotFire(Ammunition.GREEN.damage)
    println(tank.weaponLoad(Ammunition.RED))
    tank.shotFire(Ammunition.RED.damage)
}
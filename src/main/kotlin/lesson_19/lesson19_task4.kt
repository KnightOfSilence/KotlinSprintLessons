package lesson_19

enum class Ammunition(val damage: Int? = null) {
    BLUE(5), GREEN(10), RED(20), EMPTY()
}

class Tank(name: String) {
    fun weaponLoad(ammunition: Ammunition): String {
        when (ammunition) {
            Ammunition.BLUE -> return "Заряжен ${Ammunition.BLUE} снаряд с уроном ${Ammunition.BLUE.damage}."
            Ammunition.GREEN -> return "Заряжен ${Ammunition.GREEN} снаряд с уроном ${Ammunition.GREEN.damage}."
            Ammunition.RED -> return "Заряжен ${Ammunition.RED} снаряд с уроном ${Ammunition.RED.damage}."
            Ammunition.EMPTY -> return "Орудие не заряжено!"
        }
    }
}

fun shotFire(damage: Int?) {
    if (damage == null) println("Не заряжен.") else println("Произведен выстрел с уроном $damage")
}

fun main(){
    val tank = Tank("Т-34")
    println(tank.weaponLoad(Ammunition.BLUE))
    shotFire(Ammunition.BLUE.damage)
    println(tank.weaponLoad(Ammunition.EMPTY))
    shotFire(Ammunition.EMPTY.damage)
    println(tank.weaponLoad(Ammunition.GREEN))
    shotFire(Ammunition.GREEN.damage)
    println(tank.weaponLoad(Ammunition.RED))
    shotFire(Ammunition.RED.damage)
}


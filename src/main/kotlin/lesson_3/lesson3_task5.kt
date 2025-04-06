package lesson_3

fun main() {

    val str = "D2-D4;0"
    var res = str.split("-", ";")
    val x = res.get(0)
    val y = res.get(1)
    val z = res.get(2)

    println(x)
    println(y)
    println(z)

}
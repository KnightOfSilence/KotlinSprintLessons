package lesson_5

fun main() {
    println("Введите ваш вес в килограммах.")
    val userWeight = readln().toDouble()
    println("Введите ваш рост в сантиметрах.")
    val userHeight = readln().toDouble() / 100
    val bmi = userWeight / (userHeight * userHeight)

    println("Ваш индекс массы тела: %.2f".format(bmi))

    when {
        bmi < 18.5 -> println("Недостаточная масса тела.")
        bmi in 18.5..<25.0 -> println("Нормальная масса тела.")
        bmi in 25.0..<30.0 -> println("Избыточная масса тела.")
        bmi >= 30.0 -> println("Ожирение.")
    }
}
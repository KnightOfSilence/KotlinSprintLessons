package lesson_1_10.lesson_4

fun main() {

    val trainingDay = 5
    val evenDay = trainingDay % 2 == 0

    val arm = !evenDay
    val press = !evenDay
    val legs = evenDay
    val back = evenDay

    val trainingProgram = """
        |Упражнения для рук:   $arm
        |Упражнения для ног:   $legs
        |Упражнения для спины: $back
        |Упражнения для пресса:$press
    """.trimMargin()
    println(trainingProgram)

}
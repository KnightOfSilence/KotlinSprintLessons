package lesson_8

fun main() {

    val arrayOfNumbers = arrayOf(154, 642, 342, 987, 543, 675, 999)
    var totalSum = 0

    for (i in arrayOfNumbers) {
        totalSum += i
    }

    println(totalSum)

//    val arrayOfNumbers = arrayOf(154, 642, 342, 987, 543, 675, 999)
//    println(arrayOfNumbers.sum())
}
package lesson_2

fun main () {

    val numberOfEmployees = 50
    val salaryOfEmployee = 30000
    val numberOfInterns = 30
    val salaryOfIntern = 20000
    val totalCostsForEmployees = numberOfEmployees * salaryOfEmployee
    val totalCostsForAll = totalCostsForEmployees + (numberOfInterns * salaryOfIntern)
    val averageSalary = totalCostsForAll / (numberOfEmployees + numberOfInterns)

    println(averageSalary)
}
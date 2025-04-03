package Lesson_2

const val CRYSTAL = 7
const val IRON = 11
const val BAFF = 0.2

fun main() {

    val cristalBaff = (CRYSTAL * BAFF).toInt()
    val ironBaff  = (IRON * BAFF).toInt()

    println(cristalBaff)
    println(ironBaff)
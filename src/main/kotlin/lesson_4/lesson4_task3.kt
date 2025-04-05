package lesson_4

fun main() {

    var weather: Boolean = true
    var tentOpen: Boolean = true
    var airHmd: Int = 20
    var timeOfTheYear: String = "не зима"
    var res = (weather == true) and (tentOpen == true) and (airHmd == 20) and (timeOfTheYear == "не зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $res")

    weather = true
    tentOpen = true
    airHmd = 20
   timeOfTheYear = "зима"

    res = weather == true && tentOpen == true && airHmd == 20 && timeOfTheYear == "не зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $res")
}


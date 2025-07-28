package lesson_7

fun main(){

    var sms = (1000..9999).random()
    println("Ваш код авторизации: $sms")

    println("Пожалуйста, введите код из смс")
    var auth = readln().toInt()

    if (auth == sms){
        println("Добро пожаловать!")
        return
    }
    else{

    }




}
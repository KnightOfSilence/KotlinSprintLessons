package lesson_13


class PhoneBook2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        val companyInfo = company ?: "<не указано>"
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- $companyInfo"
        )
    }
}

fun main() {

    val contact1: PhoneBook2 = PhoneBook2(
        name = "Ростислав",
        phoneNumber = 89123456789
    )
    contact1.printInfo()
}
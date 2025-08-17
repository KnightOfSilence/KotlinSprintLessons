package lesson_13


class PhoneBook3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        val companyInfo = if (company != null) "Компания: $company" else "<не указано>"
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- $companyInfo"
        )
    }
}

fun main() {

    val contactList = mutableListOf<PhoneBook3>(
        PhoneBook3("Иван", 89123456798L),
        PhoneBook3("Саша", 89133456798L),
        PhoneBook3("Таня", 89143456798L, company = "null"),
        PhoneBook3("Семен", 89153456798L, company = "РЖД"),
        PhoneBook3("Алена", 89163456798L, company = "ВТБ"),
    )

    val companyList = contactList.mapNotNull { it.company }
    companyList.forEach {
        println(it)
    }
}

package lesson_13


class PhoneBook4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        val companyInfo = company ?: "<не указано>"
        println(
            "- Имя: $name\n- Номер: $phoneNumber\n- $companyInfo"
        )
        println()
    }
}

fun main() {
    val contactList = mutableListOf<PhoneBook4>()

    fun addContact(name: String, phoneNumber: String, company: String? = null) {

        println("Введите номер телефона:")
        val phoneNumber = phoneNumber.toLongOrNull()
        if (phoneNumber == null) {
            println("Вы не указали номер телефона.")
            return
        }

        val contact = PhoneBook4(name, phoneNumber, company)
        contactList.add(contact)
    }

    addContact("Иван", "89123456789", "ООО Ромашка")
    addContact("Анна", "89012345678")
    addContact("Петр", "неверный номер", "ООО Вега")
    addContact("Мария", "89345678901", null)
    addContact("Сергей", "89456789012", "null")
    addContact("Елена", "", "ООО Альфа")

    println("Список контактов в телефонной книге:")
    contactList.forEach { it.printInfo() }
}

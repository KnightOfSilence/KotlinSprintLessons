package lesson_13


class PhoneBook4(
    val name: String,
    val phoneNumber: String,
    val company: String? = null,
) {
    fun printInfo() {
        val companyInfo = company ?: "<не указано>"
        println(
            "- Имя: $name\n- Номер: $phoneNumber\n- $companyInfo"
        )
    }
}

fun main() {
    val contactList = mutableListOf<PhoneBook4>()

    fun addContact(name: String, phoneNumber: String, company: String? = null) {
        println("Введите номер телефона:")
        try {
            val phoneNumber = phoneNumber.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: $e")
            println("Номер телефона должен содержать только цифры!")
            return
            if (phoneNumber == null) {
                println("Вы не указали номер телефона.")
                return
            }

            val contact = PhoneBook4(name, phoneNumber, company)
            contactList.add(contact)
        }
    }

    addContact("Петр", "неверный номер", "ООО Вега")
    addContact("Елена", "", "ООО Альфа")
}



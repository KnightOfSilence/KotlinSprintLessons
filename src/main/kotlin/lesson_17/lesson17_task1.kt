package lesson_17

class Quiz(_question: String, _answer: String) {
    val question = _question
        get() = "Вопрос: $field"

    var answer = _answer
        get() = "Ответ: $field"
        set(value) {
            field = value
        }
}
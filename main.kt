fun main() {
    val question1 = Question(
        "Речка спятила с ума - По домам пошла сама. ___",
        "водопровод",
        "medium"
    )
    val question2 = Question(
        "Небо зелёное. Правда или ложь",
        false,
        "easy"
    )
    val question3 = Question(
        "Сколько дней между полнолуниями?",
        28,
        "hard"
    )
    println(question1.answer)
    println(question2.answer)
    println(question3.answer)
}
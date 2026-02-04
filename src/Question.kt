enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

data class Question<T>(
    val QuestionText: String,
    val answer: T,
    val difficulty: Difficulty
)
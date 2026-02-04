enum class Difficulty {
    EASY,
    MESIUM,
    HARD
}

class Question<T>(
    val QuestionText: String,
    val answer: T,
    val difficulty: Difficulty
)
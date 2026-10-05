// Codelab: Generics, objects, and extensions
// https://developer.android.com/codelabs/basic-android-kotlin-compose-generics
package generics

// Обобщённый (generic) data class: тип ответа задаётся при создании экземпляра
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

// Enum class вместо строк "easy" / "medium" / "hard"
enum class Difficulty {
    EASY, MEDIUM, HARD
}

// Интерфейс для всего, что умеет печатать прогресс
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // Companion object (синглтон внутри класса)
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    // Scope-функция let()
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

val Quiz.StudentProgress.progressTextExt: String
    get() = "${answered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBarExt() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressTextExt)
}

fun main() {
    println("--- data class toString() ---")
    println(Quiz().question1.toString())

    println("--- singleton / companion object ---")
    println("${Quiz.answered} of ${Quiz.total} answered.")

    println("--- extension property / function ---")
    println(Quiz.progressTextExt)
    Quiz.printProgressBarExt()

    println("--- interface ---")
    Quiz().printProgressBar()

    println("--- scope functions: apply() + let() ---")
    Quiz().apply {
        printQuiz()
    }
}

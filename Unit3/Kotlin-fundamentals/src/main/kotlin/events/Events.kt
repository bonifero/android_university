// Practice: Classes and Collections (приложение для отслеживания событий)
// https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections
package events

// Task 2: enum вместо строки для части дня
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

// Task 1 (+ рефакторинг из Task 2): data class события
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

// Task 7: extension-свойство без изменения самого data class
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    // Task 1
    val studyKotlin = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = Daypart.EVENING,
        durationInMinutes = 15
    )
    println(studyKotlin)

    // Task 3: все события в одной изменяемой коллекции
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    events.add(studyKotlin)
    println("Total events: ${events.size}")

    // Task 4: количество коротких событий (< 60 минут)
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    // Task 5: сводка по частям дня
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    // Task 6: последний элемент через last()
    println("Last event of the day: ${events.last().title}")

    // Task 7
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

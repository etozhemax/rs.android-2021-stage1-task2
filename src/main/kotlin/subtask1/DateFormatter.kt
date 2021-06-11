package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        var dateFormatter = DateTimeFormatter.ofPattern("d MMMM, EEEE").withLocale(Locale("ru"))
        return try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(dateFormatter)
        } catch (ex: Exception) {
            "Такого дня не существует"
        }
    }
}

package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.swing.text.DateFormatter
import kotlin.reflect.KClass
import kotlin.reflect.typeOf

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB) {
            String::class -> {
                return blockA.filterIsInstance<String>().joinToString(separator = "")
            }
            Int::class -> {
                return blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                return blockA.filterIsInstance<LocalDate>().max()?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))!!
            }
        }

        return "Empty"
    }
}

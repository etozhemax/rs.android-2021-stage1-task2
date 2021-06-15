package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        var result = false;
        var currentIndex = 0

        for (symbolB in b) {
            for (index in currentIndex until a.length) {
                if (symbolB.equals(a[index], ignoreCase = true)) {
                    result = true
                    currentIndex = index
                    break
                }
                else {
                    result = false
                }
            }
        }

        return if (result) "YES" else "NO"
    }
}

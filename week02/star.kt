Emmanuel (ej) Carter star
 fun main() {
        for (i in 1..7) {
            if (i <= 4) {
                val numSpaces = 4 - i
                val numStars = 2 * i - 1
                println(" ".repeat(numSpaces) + "*".repeat(numStars))
            } else {
                val numSpaces = i - 4
                val numStars = 7 - 2 * (i - 4)
                println(" ".repeat(numSpaces) + "*".repeat(numStars))
            }
        }
    }
    
    

emmanuel ej carter
fun main() {
    val responses = arrayOf(
        "Yes, definitely!",
        "It is certain.",
        "Without a doubt.",
        "Most likely.",
        "Outlook good.",
        "Reply hazy, try again.",
        "Better not tell you now.",
        "Cannot predict now.",
        "Don't count on it.",
        "My sources say no."
    )
    var done = false
    while (!done) {
        print("Ask a yes or no question: ")
        readLine()

        val responseIndex = (0 until responses.size).random()
        val response = responses[responseIndex]
        println(response)

        print("Do you have another question? (y/n) ")
        val answer = readLine()?.trim()?.toLowerCase()
        if (answer == "n") {
            done = true
        }
    }
    println("Goodbye!")
}

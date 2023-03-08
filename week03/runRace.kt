emmanuel carter
fun main() {
    val reader = Scanner(System.`in`)
    print("Enter the name of the first runner: ")
    val runner1 = reader.nextLine()
    print("Enter the finishing time for $runner1 (in minutes): ")
    val time1 = reader.nextInt()

    print("Enter the name of the second runner: ")
    val runner2 = reader.next()
    print("Enter the finishing time for $runner2 (in minutes): ")
    val time2 = reader.nextInt()

    print("Enter the name of the third runner: ")
    val runner3 = reader.next()
    print("Enter the finishing time for $runner3 (in minutes): ")
    val time3 = reader.nextInt()

    val runners = mapOf(runner1 to time1, runner2 to time2, runner3 to time3)

    val sortedRunners = runners.entries.sortedBy { it.value }

    println("The runners finished in the following order:")
    for ((index, runner) in sortedRunners.withIndex()) {
        println("${index + 1}. ${runner.key}")
    }
}

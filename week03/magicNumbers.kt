emmanuel (ej) carter
fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a month (in numeric form): ")
    val month = reader.nextInt()

    print("Enter a day: ")
    val day = reader.nextInt()

    print("Enter a two-digit year: ")
    val year = reader.nextInt()

    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}

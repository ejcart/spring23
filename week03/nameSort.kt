emmanuel ej carter
fun main() {
    val reader = Scanner(System.`in`)

    print("Enter the first name: ")
    val name1 = reader.nextLine()

    print("Enter the second name: ")
    val name2 = reader.nextLine()

    print("Enter the third name: ")
    val name3 = reader.nextLine()

    val names = listOf(name1, name2, name3).sorted()

    for (name in names) {
        println(name)
    }
}

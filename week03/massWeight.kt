emmanuel ej carter
fun main() {
    val reader = Scanner(System.`in`)

    print("Enter the object's mass in kilograms: ")
    val mass = reader.nextDouble()

    val weight = mass * 9.8

    println("The object's weight is $weight Newtons")

    if (weight > 1000) {
        println("The object is too heavy.")
    } else if (weight < 10) {
        println("The object is too light.")
    }
}

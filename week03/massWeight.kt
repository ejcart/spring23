emmanuel ej carter
fun main() {
   

    print("Enter the object's mass in kilograms: ")
    val mass = readLine()?.toDoubleOrNull()

    val weight = mass * 9.8

    println("The object's weight is $weight Newtons")

    if (weight > 1000) {
        println("The object is too heavy.")
    } else if (weight < 10) {
        println("The object is too light.")
    }
}

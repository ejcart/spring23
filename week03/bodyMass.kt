emmanuel ej carter
fun main() {
    val reader = Scanner(System.`in`)

    print("Enter your weight in pounds: ")
    val weight = reader.nextDouble()

    print("Enter your height in inches: ")
    val height = reader.nextDouble()

    val bmi = weight * 703 / (height * height)

    println("Your BMI is" + bmi)

    if (bmi < 18.5) {
        println("You are underweight.")
    } else if (bmi < 25) {
        println("You have optimal weight.")
    } else {
        println("You are overweight.")
    }
}

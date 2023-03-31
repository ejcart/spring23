emmanuel ej carter
import kotlin.random.Random

fun main() {
    println("Please pick a number between 1 and 10 ")
    var choice = readln().toInt()
    val cpu = Random.nextInt(1, 10)
    var guessAgain = true
    if (choice == cpu) {
        guessAgain = false

    } else {
        guessAgain == true
    }

    while (guessAgain) {
        if (choice>cpu)
            println("Too high, try again.")
        else
            if (choice<cpu)
            println("Too low, try again")
                else
        if (choice == cpu) {
            guessAgain = false
        break
        }
        println("Please pick another number between 1 and 10 ")
         choice = readln().toInt()

    }
    if(!guessAgain){
        println("congrats You Win!!")

    }
}

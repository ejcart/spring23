// ej  (emmanuel) Carter Compound Interest 2/12
import kotlin.math.pow
fun main() {
    println("Please enter principal")
    val principal = readln().toDouble()
    println("Please enter rate")
    val rate = readln().toDouble()
    println("Please enter number of times per year")
    val numOfTimes = readln().toInt()
    println("number of years.")
    val time = readln().toDouble()

    val temp = (1+(rate/numOfTimes))
    val subtotal = temp.pow(numOfTimes*time)
    val total = principal*(subtotal)
    println(total)
}

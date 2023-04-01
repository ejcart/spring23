emmanuel ej carter
import kotlin.math.pow

fun main() {
    print("Please enter time in seconds")
var time = readln().toDouble()
    println(fallingDistance(time))

}
fun fallingDistance( t: Double): Double {
    val g =9.8
    val d = (g*t.pow(2)/2)
    return d
}

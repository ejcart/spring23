emmanuel ej carter
fun main() {
    println("Please enter item’s wholesale cost")
var cost = readln().toDouble()
    println("Please enter item’s markup percentage")
    var markUp = readln().toDouble()
    println(calculateRetail(cost,markUp))
}
fun calculateRetail(a: Double, b: Double): Double = a + ((b*a)/100)

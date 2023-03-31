emmanuel ej carter
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    println("Please enter number")
val number = readln().toInt()
    var i =1
    val divisor=sqrt(number.toDouble()).roundToInt()
    println(isNumberDivisible(number, divisor))
    println(isPrime(number))

}
    fun isNumberDivisible(number: Int, divisor: Int): Boolean {
        var count=0
        var isdivisible=false
for (i in 1..divisor ){
    if(number%i==0)
        count++}

    if (count>=2)
      isdivisible=true

        return isdivisible
    }
fun isPrime(number: Int): Boolean {
    var count=0
    for (i in 1..number ){
        if(number%i==0)
        count++}

    var prime = false
    if(count<3)
        prime = true
    return prime


}

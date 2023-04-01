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
    
    val x = (numOfTimes * time)
    val y = (rate * numOfTimes)
    val amount = principal*(1+y)
    val total = amount.pow(x)
    println(total)
}

    
  
    
    
    
}

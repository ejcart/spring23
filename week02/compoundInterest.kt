// ej  (emmanuel) Carter Compound Interest 2/12
import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    val principal = reader.nextInt()
    val rate = reader.nextInt()
    val numOfTimes = reader.nextInt()
    val time = reader.nextInt()
    val x = (numOfTimes * time)
    val y = (rate * numOfTimes)
    val amount = principal*(1+y)
    val total = Math.pow(amount.toDouble(),x.toDouble())
    println(total)
    
  
    
    
    
}

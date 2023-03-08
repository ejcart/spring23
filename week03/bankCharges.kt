emmanuel carter
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val baseFee = 10
    var checkFee = 0.0

    print("Enter the number of checks written this month: ")
    val numOfChecks = reader.nextInt()

    when {
        numOfChecks < 20 -> checkFee = 0.10 * numOfChecks
        numOfChecks in 20..39 -> checkFee = 0.08 * numOfChecks
        numOfChecks in 40..59 -> checkFee = 0.06 * numOfChecks
        numOfChecks >= 60 -> checkFee = 0.04 * numOfChecks
    }

    val totalFee = baseFee + checkFee

    println("The bank's service fees for the month are: $$totalFee")
}

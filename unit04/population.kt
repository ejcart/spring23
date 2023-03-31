emmanuel ej carter
fun main() {
    println("Please Enter a starting population")
    var startPop = readln().toInt()
    println("Please Enter their average daily population increase (as a percentage)")
    var popRate = readln().toDouble()
    println("Please Enter number of days")
    var day = readln().toInt()
    var i = 1
    if (startPop >= 2 && popRate > 0) {
        println("the starting population at day 0 is $startPop ")
        for (i in 1..day) {
            var day = i
            var pop = (startPop + (popRate * startPop) * i)
            println("the population at day $i is $pop ")
        }
    }
    else
        print("Invalid entry ")
        if(startPop<2)
        println(" number CANNOT be less than 2 for the starting size of the population.")
    if(popRate<0)
    println(" Cannot accept a negative number for the average daily population increase.")
    if (day<1)
    println("Do not accept a number less than 1 for the number of days they will multiply.")
}

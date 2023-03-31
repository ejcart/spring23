emmanuel ej carter
fun main() {
   println("Please enter a string")
   val quote = readLine()

   var count=0
    if (quote != null) {
        println("Please enter a charcter to check ")
        val character = readLine()
        val char = character?.get(0)

        for (i in 0 until quote.length) {

            val c = quote!![i]
            if (c.equals(char)){
                count++

        }
    }
    println("the total number of letters is $count")
    }

}

emmanuel (ej) carter
fun main() {
        print("Enter a number between 1 and 10: ")
        val number = readLine()?.toIntOrNull()

        if (number != null) {
            if (number<=10) {
                if (number==1 )
                    println("I")
                else
                    if (number==2 )
                        println("II")
                if (number==3 )
                    println("III")
                else
                    if (number==4 )
                        println("IV")
                    else
                        if (number==5 )
                            println("V")
                        else
                            if (number==6 )
                                println("VI")
                            else
                                if (number==7 )
                                    println("VII")
                                else
                                    if (number==8 )
                                        println("VIII")
                                    else
                                        if (number==9 ) println("IX")
                                        else
                                            if (number==10 ) println("X")
                                            else
                                                if(number>10||number<1)
                                                println("Error: Number must be between 1 and 10.")
            }
        }
    }

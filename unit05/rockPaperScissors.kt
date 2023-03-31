emmanuel "ej" Carter
import kotlin.random.Random

fun main() {
        var playAgain = true
        print("Do you want to play? Y/N ")
        var play =readLine()
        if(play=="N")
        {playAgain=false}
        else
            if(play =="Y")
            {playAgain==true}
                else
                    print("invalid Entry")
        while(playAgain) {
            println("These are the rules of the game ")
            println("Rock is 1 ")
            println("Paper is 2 ")
            println("Scissors is 3 ")
            print("What is your choice")
            var player= readLine()?.toIntOrNull()
            val cpu= Random.nextInt(1,4)
            println(cpu)
            if((player==1&&cpu==3)||(player==2&&cpu==1)||(player==3&&cpu==2))
            { println("You Win") }
            else
                if((player==1&&cpu==2)||(player==2&&cpu==3)||(player==3&&cpu==1))
                { println("You lose") }
            else
            if((player==1&&cpu==1)||(player==2&&cpu==2)||(player==3&&cpu==3))
            { println("You Tie") }
            else
            {print("invalid Answer")}



            print("Do you want to play Again? Y/N ")
            play = readLine()
            if (play == "N") {
                playAgain = false
            } else
                if (play == "Y") {
                    playAgain == true
                } else
                    print("invalid Entry")

        }

    }

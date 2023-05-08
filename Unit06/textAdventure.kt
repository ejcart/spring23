fun main() {
    val roomList = arrayOfNulls<Array<Any?>>(7)
    roomList[0] = arrayOf("master Bedroom. Exits to the north and east", 3, 1, null, null)
    roomList[1] = arrayOf("great hall . there are exits to the north east and west", 4, 2, null, 0)
    roomList[2] = arrayOf("dining room . exits to the north and west", 5, null, null, 1)
    roomList[3] = arrayOf("spare bedroom. exits to the south and east", null, 4, 0, null)
    roomList[4] = arrayOf("lesser hall . exits to the north east south and west", 6, 5, 1, 3)
    roomList[5] = arrayOf("kitchen. exits to the south and west", null, null, 2, 4)
    roomList[6] = arrayOf("balcony. exits to the south", null, null, 4, null)
    // roomList[0]=arrayOf("description",n,e,s,w)
    var currentRoom = 6
    var done = false
    while (!done) {
        if (roomList[currentRoom] == roomList[0]) {
            done = true
        } else {
            println(roomList[currentRoom]?.get(0))
        }
        print("Please pick a direction (N:North, E:East, S:South, W:West)")
        var direction = readln().toUpperCase()
        val nextRoom: Int? = when (direction) {
            "N" -> roomList[currentRoom]?.get(1) as Int?
            "E" -> roomList[currentRoom]?.get(2) as Int?
            "S" -> roomList[currentRoom]?.get(3) as Int?
            "W" -> roomList[currentRoom]?.get(4) as Int?
            else -> {
                println("error Invalid Direction Please pick a direction (N:North E:East S:South W:West)")
                null
            }
        }
        if (nextRoom == null) {
            continue
        }
        val room = roomList[nextRoom]
        if (room == null) {
            println("You cannot go that way.")
        } else {
            currentRoom = nextRoom
        }
    }
}

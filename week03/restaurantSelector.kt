emmanuel carter
fun main() {
    println("Is anyone in your party a vegetarian? (yes/no)")
    val isVegetarian = readLine()
    println("Is anyone in your party a vegan? (yes/no)")
    val isVegan = readLine()
    println("Is anyone in your party gluten-free? (yes/no)")
    val isGlutenFree = readLine()

    val restaurants = mutableListOf<String>()

    if (isVegetarian.equals("yes", ignoreCase = true)) {
        restaurants.add("Main Street Pizza Company")
        restaurants.add("Corner Cafe")
        restaurants.add("The Chef's Kitchen")
    } else {
        restaurants.add("Joe's Gourmet Burgers")
        restaurants.add("Main Street Pizza Company")
        restaurants.add("Mama's Fine Italian")
        restaurants.add("The Chef's Kitchen")
    }

    if (isVegan.equals("yes", ignoreCase = true)) {
        restaurants.retainAll(listOf("Corner Cafe", "The Chef's Kitchen"))
    }

    if (isGlutenFree.equals("yes", ignoreCase = true)) {
        restaurants.retainAll(listOf("Main Street Pizza Company", "Corner Cafe", "The Chef's Kitchen"))
    }

    println("Here are your restaurant choices:")
    for (restaurant in restaurants) {
        println(restaurant)
    }
}

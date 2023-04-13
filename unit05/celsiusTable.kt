Emmanuel "ej" Carter
fun main() {


    for(i in 0..20 ) {
        var f = i.toDouble()
        print("$f ")
        println(celsius(f))
    }
}
fun celsius( f: Double): Double {
    var c = f*9/5+32

    return c
}

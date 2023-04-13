emmanuel "ej" Carter
fun main() {
    print("Please Enter the number of shares")
    val ns= readln().toDouble()
    print("Please Enter the sale price per share")
    val sp = readln().toDouble()
    print("Please Enter the sale commission paid")
    val sc = readln().toDouble()
    print("Please Enter the purchase price per share")
    val pp = readln().toDouble()
    print("Please Enter the purchase commission paid")
    val pc = readln().toDouble()
    println(profitCal(ns,sp,sc,pp,pc))



}
fun profitCal(NS: Double, SP: Double, SC: Double, PP: Double, PC: Double): Double {

    val profit=(((NS*SP)-SC)-((NS*PP)+PC))
    return profit
}

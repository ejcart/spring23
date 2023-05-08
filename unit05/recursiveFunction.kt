emmanuel ej carter
fun main() {
    for(i in 0..10 ) {
        var num = i
        val fib = fibonacci(num)
        println("The Fibonacci number for $num is: $fib")
    }
}

fun fibonacci(num: Int): Int {
    return if (num <= 0) {
        0
    } else if (num == 1 || num == 2) {
        1
    } else {
        fibonacci(num - 1) + fibonacci(num - 2)
    }
}

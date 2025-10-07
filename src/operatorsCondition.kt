fun main(){
    var x = 28
    val y = 10

    println("x + Y = ${x + y}")
    println("x - Y = ${x - y}")
    println("x * Y = ${x * y}")
    println("x * Y = ${x / y}")
    println("x % Y = ${x % y}")

    // x = x + 2
    x += 2
    println("x = x + 2 = ${x}")
    x -= 2
    println("x = x - 2 = ${x}")
    x *= 2
    println("x = x * 2 = ${x}")
    x /= 2
    println("x = x / 2 = ${x}")
    x %= 2
    println("x = x % 2 = ${x}")

//    increment operator post and pre
    println("x++ = ${x++}")
    println("++x = ${++x}")
//    decrement
    println("x-- = ${x--}")
    println("--x = ${--x}")

}
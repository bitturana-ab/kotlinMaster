fun main(){
    val name = "Leo Das"
    var age = 20
    age = 48
    val integer = 21474836488
    println("Hello $name your age is $age")
    println("Integer max value is ${Int.MAX_VALUE}")
    println("Integer min value is ${Int.MIN_VALUE}")
//    this shouldn't run but worked
    println("Integer value is $integer")
    println("Byte max value is ${Byte.MAX_VALUE}")
    println("Byte min value is ${Byte.MIN_VALUE}")
    println("Short max value is ${Short.MAX_VALUE}")
    println("Short min value is ${Short.MIN_VALUE}")
    println("Long max value is ${Long.MAX_VALUE}")
    println("Long min value is ${Long.MIN_VALUE}")
    println("Float min value is ${Float.MIN_VALUE}")
    println("Float max value is ${Float.MAX_VALUE}")
// input by user as string in kotlin
    println("Please enter a number:")
    val number = readln(); // this is string
    val intNumber = number.toInt()
//    println("You have entered $number")
    println("Is number even? ${intNumber % 2 == 0}")

}
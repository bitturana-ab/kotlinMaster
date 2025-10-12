fun main(){
//    all include
    for(i in 1..10){
        print(" $i")
    }
    println()
//    until means not include
    for(i in 1 until 10)print(" $i")
    println()
//    downTo means decrement order
    for (i in 10 downTo 1)print(" $i")
    println()
//    steps jump in loop
    for (i in 1..10 step 2) print(" $i")

    println()
//    if statement as checking
    for(i in 1..10){
//        check numbers
        if(i in 4..9)continue

        println(i)
    }

//    while loop
//    println("How many numbers will you enter? ")
//    val numbers = readln().toIntOrNull() ?:0
//    var sum = 0
//    var i = 0
//    while (i < numbers){
//        println("Enter #${i+1} number: ")
////        if not int then retry not increase chance i
//        val number = readln().toIntOrNull() ?: continue
//        sum += number
//        i++
//    }
//    println("Sum = $sum")

//    list of int from user

    println("How many numbers will you enter? ")
    val numbers = readln().toIntOrNull() ?:0
    val numbersList = mutableListOf<Int>()
    var i = 0
    while (i < numbers){
        println("Enter #${i + 1} number: ")
//        if not int then retry not increase chance i
        val number = readln().toIntOrNull() ?: continue
        numbersList.add(number)
        i++
    }
    println("Numbers: $numbersList")
}
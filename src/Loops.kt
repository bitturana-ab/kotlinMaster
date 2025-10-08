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
}
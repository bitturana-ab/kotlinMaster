fun main(){
    println("Sum is = ${addNumbers(28,10,25)}")
//    unknown numbers sum
    println("Unknow numbers sum = ${addManyNumbers(28,25,123,123,45)}")
}
//know how many numbers will be
fun addNumbers( a: Int,b: Int,c: Int): Int{
    return a+b+c
}

//unknown how many numbers will be
//kotlin treats vararg as array  [Array<Type>]
fun addManyNumbers(vararg numbers: Int ): Int{
    var sum = 0
    for (i in numbers){
        sum += i
    }
    return sum
}

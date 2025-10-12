fun main(){
    val names: Array<String> = arrayOf("Sanjay","vijay","AB")
    println(names[1])
    for(name in names)print("$name ")
//    mixed typed array
    println()
    val mixedElements = arrayOf(28,25,10,"Ancy","Sanjay",'A','B')
    for(num in mixedElements){
//        print("$num ")
//        check is char or not
        if (num is Char)print("$num ")
    }
//    int array
    println("Enter index to search number: ")
    val index = readln()
    val indexAsInteger = index.toIntOrNull()
    val numbers = intArrayOf(28,25,10,69) + 7 // add element to array like dynamic
    numbers[1] = 22
    if(indexAsInteger != null && indexAsInteger in 0..numbers.lastIndex){
        println("Your favourite number is : ${numbers[indexAsInteger]}")
    }
    else
    {
        println("That index doesn't exist")
    }
}
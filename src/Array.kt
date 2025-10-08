fun main(){
    val names = arrayOf("Sanjay","vijay","AB")
    println(names[1])
    for(name in names)print("$name ")
//    mixed typed array
    println()
    val numbers = arrayOf(28,25,10,"Ancy","Sanjay",'A','B')
    for(num in numbers){
//        print("$num ")
//        check is char or not
        if (num is Char)print("$num ")
    }
}
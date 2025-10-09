//for checking create main fun here
fun main(){
    User("Sanjay")
    User("ancy",28)
    User(age =  28)
//    enum class
    println(Direction.NORTH)
    println(Direction.SOUTH)
}
//created object in OOP file
//class User(name: String,var age: Int){
////    constructor for only name params and set default age 28
//    constructor(name: String):this(name,28)
////    can have multiple but diff params
//    constructor(age: Int):this("user",age)
//    var name: String
//    init {
//        if(name.lowercase().startsWith("a")){
//            this.name = name
//            println("Name: ${this.name} and age: $age")
//        }else{
//            this.name = "user"
//            println("User $name doesn't start with 'a' or 'A' ")
//        }
//    }
//
//}

//auto constructor by kotlin

class User(name: String="unknown",var age: Int=20){
    var name: String
    init {
        if(name.lowercase().startsWith("a")){
            this.name = name
            println("Name: ${this.name} and age: $age")
        }else{
            this.name = "user"
            println("User $name doesn't start with 'a' or 'A' and default age: $age ")
        }
    }

}
//enum class means fixed constant for selecting
enum class Direction{
    NORTH,SOUTH,EAST,WEST
}
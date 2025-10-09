//for checking create main fun here
fun main(){
    User("Sanjay")
    User("ancy",28)
    User(age =  28)
//    enum class
//    println(Direction.NORTH)
    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)
    Direction.SOUTH.getData()
//    when like switch case
//    val direction = Direction.EAST
    val direction = Direction.valueOf("south".uppercase())

    when(direction){
        Direction.EAST -> println("Direction is East")
        Direction.WEST -> println("Direction is West")
        Direction.NORTH -> println("Direction is North")
        Direction.SOUTH -> println("Direction is South")
    }
}

enum class Direction(var direction: String,var distance: Int){
    NORTH("north",10),
    SOUTH("south",20),
    EAST("east",20),
    WEST("west",30);
    fun getData(){
        println("Direction = $direction and distance = $distance")
    }
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
//enum class Direction{
//    NORTH,SOUTH,EAST,WEST
//}
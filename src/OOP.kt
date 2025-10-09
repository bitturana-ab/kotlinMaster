fun main(){
    var car = Car()
    car.name = "BMW"
    car.price = "28K$"
    println(car.name)
    car.move()

//    paramsCar
    var car2 = ParamsCar("Kontessa","mini","25k")
    car2.move()

//    user class defined in classes file
    val user = User("Ancy",25)
    val user2 = User("Sanjay",28)

}
class Car{
    var name=""
    var model=""
    var price=""
    var doors=""
    fun move(){
        println("Car is moving")
    }
    fun stop(){
        println("Car has stopped")
    }
}
//parameter constructor
//class ParamsCar(name: String,model:String,price:String){
//    val name = name
//    val model = model
//    val price = price
//    fun move(){
//        println("$name car is moving")
//    }
//}

//define var in parenthesis
class ParamsCar( val name: String,val model:String,val price:String){
//    val name = name.trim()
    fun move(){
        println("$name car is moving")
    }
}
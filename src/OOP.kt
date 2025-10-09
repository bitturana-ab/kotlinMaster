fun main(){
    var car = Car()
    car.name = "BMW"
    car.price = "28K$"
    println(car.name)
    car.move()

//    paramsCar
    var car2 = ParamsCar("Kontessa","mini","25k")
    car2.move()

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
class ParamsCar(name: String,model:String,price:String){
    val name = name
    val model = model
    val price = price
    fun move(){
        println("$name car is moving")
    }
}
fun main(){
    var car = Car()
    car.name = "BMW"
    car.price = "28K$"
    println(car.name)
    car.move()

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
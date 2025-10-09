//for checking create main fun here
fun main(){
    User("Sanjay")
    User("ancy","29")
}
//created object in OOP file
class User(name: String,var age: String){
//    constructor for only name params and set default age 28
    constructor(name: String):this(name,"28")
    var name: String
    init {
        if(name.lowercase().startsWith("a")){
            this.name = name
            println("Name: ${this.name} and age: $age")
        }else{
            this.name = "user"
            println("User $name doesn't start with 'a' or 'A' ")
        }
    }

}
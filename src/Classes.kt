//created object in OOP file
class User(name: String,var age: String){
    var name: String
    init {
        if(name.lowercase().startsWith("a")){
            this.name = name
            println("Name: ${this.name}")
        }else{
            this.name = "user"
            println("User $name doesn't start with 'a' or 'A' ")
        }
    }

}
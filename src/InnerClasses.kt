import kotlin.math.acos

fun main(){
    var listView = ListView(arrayOf("sanjay","vijay","ab","leo das","jd"))
    listView.ListViewItem().displayItem(3)

//    Account section
    var account = Account("Leo Das",10000)
    account.validate().withdraw(20000)
}

//challenge -> Account username, amount, transaction, checkAmount
class Account(val username: String,val amount: Int){
    var balance:Int = amount
    inner class validate(){
        fun withdraw(amount: Int){
            if (balance < 0){
                println("Insufficient balance")
                return
            }
            if(balance < amount) {
                println("Min balance")
                return
            }
            balance -= amount
            println("Transaction successfully of amount $amount")
            println("Available balance is = $balance")


        }

    }

}

class ListView(val lists: Array<String>){
    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(lists[position])
        }
    }
}
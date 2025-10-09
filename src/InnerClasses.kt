import kotlin.math.acos

fun main(){
    var listView = ListView(arrayOf("sanjay","vijay","ab","leo das","jd"))
    listView.ListViewItem().displayItem(3)

//    Account section
    var account = Account("Leo Das",10000)
    account.withdraw(2000)
}

//challenge -> Account username, amount, transaction, checkAmount
class Account(val username: String,val amount: Int){
//    private but
    var balance:Int = amount
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount > 0){
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance} ")
        }
        else{
            println("Deposit should be more than 0")
        }
    }

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
        transactions.add(-balance)
        println("Transaction successfully of amount $amount")
        println("Available balance is = $balance")
        }
}

class ListView(val lists: Array<String>){
    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(lists[position])
        }
    }
}
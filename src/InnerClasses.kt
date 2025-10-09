fun main(){
    var listView = ListView(arrayOf("sanjay","vijay","ab","leo das","jd"))
    listView.ListViewItem().displayItem(3)
}

class ListView(val lists: Array<String>){
    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(lists[position])
        }
    }
}
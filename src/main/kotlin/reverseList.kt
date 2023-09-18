fun main(){
    var list = mutableListOf<Int>()
    println("Enter number of elements: ")
    val n = readLine()?.toInt()
    if(n!=null){
        for(i in 1..n){
            println("Enter element: ")
            val x = readLine()?.toInt()
            if(x!=null)
                list.add(x)
        }
        for(item in n-1 downTo 0){
            println(list[item])
        }
    }
}
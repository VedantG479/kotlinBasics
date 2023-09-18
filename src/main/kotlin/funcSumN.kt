fun main(){
    println("Enter a number: ")
    var x = readLine()?.toInt()
    if(x!=null)
        sum(x)
}
fun sum(num : Int){
    var result = 0
    for(i in 1..num){
        result+=i
    }
    println(result)
}
fun main(){
    var num = readLine()?.toInt()
    if(num!=null){
        println("Lets count from $num to 0")
        while(num>0){
            print("$num ")
            num--
        }
    }
}
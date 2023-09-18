fun main(){
    println("Enter the base")
    var a = readLine()?.toInt()
    println("Enter the power")
    var b = readLine()?.toInt()
    var result = 1
    if(a!=null && b!=null){
        print("$a raised to $b is ")
        while(b>0){
            result *= a
            b--
        }
        print(result)
    }
}
fun main(){
    print("Enter the number of terms: ")
    val n = readLine()?.toInt()
    if(n!=null){
        if(n<=1)
            print(0)
        else{
            var a = 0
            var b = 1
            print("$a $b")
            for(i in 2..<n){
                val temp = b
                b += a
                a = temp
                println(b)
            }
        }
    }
}
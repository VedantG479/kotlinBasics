fun main(){
    var input = readLine()?.toInt()
    if(input!=null){
        if(input.isPrime())
            print("$input is prime")
        else
            print("$input is not prime")
    }
}
fun Int.isPrime() : Boolean{
    for(i in 2..this-1){
        if(this%i==0)
            return false
    }
    return true
}
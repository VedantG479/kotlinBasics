fun main(){
    val altSum = altAdd(4,26,7,3,1,7,9,3,64,8,4)
    print("Alternating sum is: $altSum")
}
fun altAdd(vararg numbers : Int): Int{
    var operation = 1
    var result = 0
    for(item in numbers){
        result += operation*item
        operation*=-1
    }
    return result
}
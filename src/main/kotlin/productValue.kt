fun main(){
    var list = listOf(3,5,2,6,2,10)
    print(list.productElements())
}
fun List<Int>.productElements() : Int{
    var product = 1
    for(item in this){
        product *= item
    }
    return product
}
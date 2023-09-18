fun main(){
    var arr = arrayOf(7,3,6,4,9,6,2,1)
    var max = arr[0]
    for(item in arr){
        if(item>max)
            max = item
    }
    print("Maximum element is $max")
}
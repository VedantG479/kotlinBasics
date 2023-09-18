fun main(){
    val list = listOf(3,6,2,5,2,7,1,9,0)
    print("Enter element to search: ")
    val num = readLine()?.toInt()
    if(num!=null)
        print(search(list,num))
}
fun search(list: List<Int>,target: Int): Int{
    for(item in list){
        if(item==target)
            return (list.indexOf(item))
    }
    return -1
}
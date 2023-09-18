fun main(){
    val name = readLine()
    println("Hi, how are you $name ?")
    println(name?.uppercase())
    if(name!=null) {
        println(name.toInt()-5)
    }
}
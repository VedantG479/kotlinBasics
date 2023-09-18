open class shape(var name: String) {
    init{
        println("i am shape(Super) class")
    }
    fun changeName(newName: String){
        name = newName
    }
}
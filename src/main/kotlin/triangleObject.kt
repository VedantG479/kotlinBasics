fun main(){
    val myTriangle = triangle(2.0,4.0,6.0)
    println("Area of triangle is: ${myTriangle.area()}")
    println("Perimeter of triangle is: ${myTriangle.perimeter()}")
    myTriangle.changeName("tri2")
    print(myTriangle.name)
}
import kotlin.math.sqrt

class triangle(val a: Double, val b: Double, val c: Double) : shape("tri") {
    init{
        println("$name created with sides $a, $b, and $c")
    }
    val s = (a+b+c)/2
    fun area() = sqrt(s*(s-a)*(s-b)*(s-c))
    fun perimeter() = a+b+c
}
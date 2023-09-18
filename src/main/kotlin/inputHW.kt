fun main(){
    println("Enter your age")
    val age = readLine()
    if(age!=null) {
        if (age.toInt() < 18)
            print("Not an adult")
        else if ((age.toInt() >= 18) && (age.toInt() <= 50))
            print("You are an adult")
        else
            print("You are really really old")
    }
}
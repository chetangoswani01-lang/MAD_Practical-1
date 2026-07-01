fun main(){
    println("Enter a number:")
    var num=readln().toInt()
    println("Factorial of $num")
}
fun factorial(num:Int):Int{
    return num * factorial(num = num-1)
}
package recursiveFunction

fun main() {
    fun factorial(i:Int):Int{
        var hasil = 1
        for (a in i downTo 1){
            hasil *=a
        }
        return hasil
    }
    fun factorialrecursive(value:Int):Int{
        return if(value==1)value.toInt()
            else{value*factorialrecursive(value-1)
        }
    }
    println(factorial(5))
    println(factorialrecursive(5))
}
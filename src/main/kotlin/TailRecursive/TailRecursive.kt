package TailRecursive
fun main() {
    tailrec fun display(value:Int){
        println(value)
        if (value>0){
            display(value-1)
        }
    }
    fun fibbonaci(n:Long) :Long{ //Recursive Function
        return if (n<2)n else fibbonaci(n-2)+fibbonaci(n-1)
    }
    tailrec fun fibonaci(n:Int,a:Int=0,b:Int=1):Int{ //Tailrec Recursive function
        return when(n){
            0 -> a
            1 -> b
            else -> fibonaci(n-1,b,a+b)
        }

    }
    println(fibbonaci(5))
    println(fibonaci(5))

}
fun main() {
    tailrec fun display(value:Int){
        println(value)
        if (value>0){
            display(value-1)
        }
    }
    fun fibbonaci(n:Long) :Long{ //Recursive Function
        return if (n<2)n else fibbonaci(n-1)+fibbonaci(n-2)
    }
    tailrec fun fibonaci(n:Int,a:Int=0,b:Int=1):Int{ //Tailrec Recursive function
        return when(n){
            0 -> a
            1 -> b
            else -> fibonaci(n-1,a+b,b)
        }

    }
    println(fibonaci(11))
    println(fibbonaci(4))

}
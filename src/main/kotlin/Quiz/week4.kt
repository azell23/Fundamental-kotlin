fun fibonacisequence(a:Int):Unit {
    var b=0
    var c=1
    for (i in 0..a){
        print("$b ")
        val sum =b+c
         b=c
         c=sum
    }

}
fun seventValue(n:Int,a:Int=0,b:Int=1):Int{ //Tailrec Recursive function
    return when(n){
        0 -> a
        1 -> b
        else -> seventValue(n-1,b,a+b,)
    }

}
fun pascalTriangle(n:Int):Int {
    var z=1
    var i=1
    while(i<=n){
        z=z*i
        i++
    }
    return z

}
fun main() {
    println(fibonacisequence(10))
    println(seventValue(7))

}

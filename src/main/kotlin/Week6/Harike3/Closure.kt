fun main() {
    var angka=0
    var nama=""
    val lambda:() -> Unit = {
        println("Lambda Increment")
        angka++
    }
    val anonymous=fun(){
        println("Anonymous Increment")
        angka++
        nama="Katsumaru"
    }
    fun increment(){
        println("Function Increment")
        angka++
    }
    lambda()
    anonymous()
    increment()
    println(angka)
    println(nama)
}
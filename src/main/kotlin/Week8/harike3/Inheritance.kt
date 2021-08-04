package Week8.harike3

open class Inheritance(var a:String) {
    fun single(b:Int)= println("Nama = ${this.a} umur = $b ")
}
class child(a:String) :Inheritance(a)
class child2(a: String) :Inheritance(a)

fun main() {
    val hil=child("Hildan")
    hil.single(10)
    val dan=child2("Rizky")
    dan.single(15)

}
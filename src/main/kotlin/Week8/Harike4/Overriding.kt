package Week8.Harike4
open class Overriding(var a: String) {
    open fun single(b:Int)= println("Nama = ${this.a} umur = $b ")
}
class child(a:String) : Overriding(a){
     override fun single(b: Int) {
        println("Nomer rumah saya $b")
    }
}
class child2(a: String) : Overriding(a){
    final override fun single(b: Int) {
        println("Tinggi Rumah saya $b Meter")
    }
}
class child3(a: String): Overriding(a)

fun main() {
    val hil=child("Hildan")
    hil.single(10)
    val dan=child2("Rizky")
    dan.single(15)
    val riz=child3("Ramadhan")
    riz.single(50)

}
package Week11.Harike4

open class Inheritance(var a:String) {
    fun single(a:String)= println("Nama = ${this.a} umur = $a ")
}
class child(a:String) :Inheritance(a)
class kapten(a:String):Inheritance(a)

fun main() {
    var hil: Inheritance =child("Hildan")
    hil.single("1")
    hil = kapten("Katsumaru")
    hil.single("2")

}
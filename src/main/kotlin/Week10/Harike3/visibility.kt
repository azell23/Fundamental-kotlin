package Week10.Harike3

open class visiblity(val name:String) {
    protected fun id(){ //bisa diakses diturunanya
        println("Nama ${this.name}")
    }
}
class modifier(name: String):visiblity(name) {
    open fun id1() {
        super.id()
    }
}
class extension(val name: String,val umur:Int)
fun extension.function(){
    if (this != null){
        println("Nama ${this.name.toUpperCase()} dan Umur ${this.umur}")
    }
}
val extension.properties: String
    get() = this.name.toLowerCase()



fun main() {
    val hil=modifier("Rizkay")
    hil.id1()
    val dan =extension("KATSumaru",15)
    dan.function()
    println(dan.properties)
}
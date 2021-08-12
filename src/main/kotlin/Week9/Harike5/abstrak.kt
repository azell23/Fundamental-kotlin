package Week9.Harike5

abstract class abstrak { //abstract class
    abstract val nama:String//abstract properties
    abstract fun upper()//abstract function
}
class username:abstrak(){
    override val nama: String="Katsumaru"
    override fun upper() {
        println(nama.toUpperCase())
    }
}

fun main() {
    var hil=username()
    hil.upper()
}
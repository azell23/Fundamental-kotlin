package Week10.Harike1

class GetterSetter(title:String) {
    var name:String=title
        get() {
            println("this getter")
            return field
        }
        set(value) {
            println("this setter")
            if (value.isNotBlank()){
                field = value
            }
        }
}
class getter(val name:String){
    val bigname:String
        get() = name.toUpperCase()
}
class lateinit{
    lateinit var name:String
    fun printnama(){
        name="azel"
        println("${this.name}")
    }
}

fun main() {
    val hil=GetterSetter("Katsumaru")
    println(hil.name)
    hil.name=""
    val dan=getter("katsumaru")
    println(dan.name)
    println(dan.bigname)
    val riz=lateinit()
    riz.printnama()
}
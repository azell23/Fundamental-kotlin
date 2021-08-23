package Week11.Harike1

import kotlin.properties.Delegates

class delprop {
    val name by lazy {
        println("Lazy Properties")
        "Mail"
    }
}
class obser(name:String){
    var Warisan:String by Delegates.observable(name){
            property, oldValue, newValue ->
        println("${property.name}  dari $oldValue ke $newValue")
    }
}

fun main() {
    val hil=delprop()
    println(hil.name)
    println(hil.name)
    val dan=obser("Ismail")
    dan.Warisan="Mail"
    dan.Warisan="Namikaze"
}
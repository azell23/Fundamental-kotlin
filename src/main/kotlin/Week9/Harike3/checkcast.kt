package Week9.Harike3

class handphone(var name:String)
class laptop(var name:String)
class checkcast {
    fun print(bebas: Any){
        println(bebas)
    }
    fun check(bebas: Any){
        if (bebas is laptop){
            println("laptop dengan nama ${bebas.name}")
        }else if(bebas is handphone){
            println("handphone dengan nama ${bebas.name}")
        }else{
            println(bebas)
        }
    }
    fun checkwhen(bebas: Any){
        when (bebas) {
            is laptop -> println("laptop dengan nama ${bebas.name}")
            is handphone -> println("handphone dengan nama ${bebas.name}")
            else -> println(bebas)
        }
    }
    fun printAs(bebas: Any){
        val nilai=bebas as? String
        println(nilai)
    }
}

fun main() {
    var hil=checkcast()
    hil.print(1)
    hil.print("String")
    hil.checkwhen(laptop("Lenovo"))
    hil.checkwhen(handphone("Xiaomi"))
    hil.printAs("Katsumaru") //output bertipe data string
    hil.printAs(1) //output null
}

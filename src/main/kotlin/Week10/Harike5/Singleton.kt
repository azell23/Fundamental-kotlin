package Week10.Harike5

object Singleton {
    val name="IsMAIl"
    fun lower(value:String):String{
        return value.toLowerCase()
    }
}
class innerobject() {
    object Singleton {
        val name = "IsMAIl"
        fun lower(value: String): String {
            return value.toLowerCase()
        }
    }
    companion object{
        val name = "IsMAIl"
        fun uppercase(value: String): String {
            return value.toUpperCase()
        }
    }
}
typealias inobj = innerobject
typealias Stringuser=() -> String
fun user(user :Stringuser){
    println("Username ${user().toUpperCase()}")
}
fun main() {
    println(Singleton.lower("ISMAIL"))
    println(innerobject.Singleton.name)
    println(innerobject.uppercase("ismail"))
    println(inobj.uppercase("ismail"))
    user ({ "Hilfsm" })

}
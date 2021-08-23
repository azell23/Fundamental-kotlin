package Week11.Harike1

inline class indele(val name:String) {
    fun hi(){
        println("Hi $name")
    }
}
interface dele{
    fun hi(name:String)
    fun bye(name: String)
}
class delegasi:dele{
    override fun bye(name: String) {
        println("bye $name")
    }

    override fun hi(name: String) {
        println("hi $name")
    }
}
class mydelegasi(val dan:dele):dele by dan
fun main() {
    val hil=indele("budi")
    hil.hi()
    val dan=delegasi()
    dan.bye("budi")
    val riz=mydelegasi(dan)
    riz.bye("ismail")
}
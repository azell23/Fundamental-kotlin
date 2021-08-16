package Week10.Harike2

interface interaksi {
    val username:String
    fun id(name:String){
        println("Nama :$name Username :${this.username}")
    }
}
interface moveA:interaksi{ //inheritance antar interface
    fun move()= println("Move A")
}
interface moveB{
    fun move()= println("Move B")
}
class bio(override val username: String):interaksi,moveA,moveB{ //multiple inheritance,
    //jika interaksi sudah ekstend dengan move A
    //disini kita bisa hapus saja ekstend interaksinya.
    override fun move() {
        super<moveA>.move()
        super<moveB>.move()
    }
}

fun main() {
    val hil=bio("rizky")
    hil.id("Hildan")
    hil.move()
}
package Week11.Harike2

data class overload(val total:Int){
    operator fun plus(point:overload):overload{
        return overload(this.total+point.total)
    }
}
class check(val nama:String){
    fun Check(){
        if (nama != null){
            println("Tidak Null")
        }
    }

}
fun check2(name: check?){
    val name = name?.nama
    println("hello $name")
}
fun check3(name: check?){
    val name = name!!.nama
    println("hello $name")
}

fun main() {
    val a=overload(100)
    val b=overload(100)
    val c=a + b
    println(c)
    val hil=check("hahha")
    hil.Check()
    check2(null)
    check3(null)
}

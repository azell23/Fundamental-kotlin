package Week9.Harike1

open class supercons(val name:String,val sudut:Int, val warna:String) {
    constructor(name:String,sudut: Int):this(name,sudut,"Merah")
    constructor(name: String): this(name,4)
}
class segitiga: supercons{
    constructor():super("Segitiga",3)
    constructor(warna: String):super("segitiga",3,warna)
}
class segitiga2(name: String,warna: String):supercons(name,3,warna){
    constructor(name: String):this(name,"Hijau")
}


fun main() {
    var hil=segitiga("Biru")
    println(hil.name)
    println(hil.sudut)

    println(hil.warna)
    var dan=segitiga2("segitiga")
    println(dan.name)
    println(dan.warna)
}
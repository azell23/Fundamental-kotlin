fun hai(nama:String,ubah:(String)->String):String{
    val name=ubah(nama)
    return " $name"
}
fun main() {
    val Up =hai("Katsumaru",{value:String ->value.toUpperCase() }) //tidak menggunakan trailing lambda
    val upTrail=hai("Katsumaru") {value:String ->              //Menggunakan Trailing lambda
        value.toLowerCase() }
    println(Up)
    println(upTrail)
}
package Wekk7.Harike2

class constructor(awal:String,akhir:String) {
    var nama=awal.toUpperCase()
    var nama1=akhir.toLowerCase()
    init{
        println("Belajar $nama $nama1")
    }
}

fun main() {
    var hil=constructor("oop","kotlin")
    println(hil.nama)
    println(hil.nama1)
}
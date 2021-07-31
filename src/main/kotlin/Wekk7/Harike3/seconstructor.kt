package Wekk7.Harike3

class seconstructor(awal:String,akhir:String,umur:Int) {
    var nama=awal.toUpperCase()
    var nama1=akhir.toLowerCase()
    init{
        println("Belajar $nama $nama1")
    }
    constructor(awal: String,akhir: String):this(awal,akhir,umur = 10){
        println("secondary")
    }
}

fun main() {
    var primary=seconstructor("oop","KOTLIN")
    var secondary=seconstructor("Hildan","Katsumaru")
    println(primary.nama)
    println(primary.nama1)
    println(secondary.nama)
}
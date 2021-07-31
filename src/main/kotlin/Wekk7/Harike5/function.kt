package Wekk7.Harike5

class function(var nama:String="",var umur:Int) {
    fun id(){
        println("nama :$nama umur :$umur")
    }
}

fun main() {
    var hil=function("Katsumaru",10)
    hil.id()
}
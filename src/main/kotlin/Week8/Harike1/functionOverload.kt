package Week8.Harike1

class functionOverload(var nomer:Int,var klub:String) {
    fun id(pemain:String){
        println("nama :$pemain No.punggung :$nomer")
    }
    fun id(club:Int){
        println("Nama $klub tahun kelahiran $club")
    }

}

fun main() {
    var dan =functionOverload(10,"Katsumaru")
    dan.id("Budi")
    dan.id(2010)
}
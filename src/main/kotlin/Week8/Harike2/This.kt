package Week8.Harike2

class functionOverload(var tahun:Int) {
    fun pemain(nama:String,tahun: Int){
        println("Nama :$nama kelahiran $nama tahun :${this.tahun} peresmian tim pada tahun :$tahun" )
    }
}

fun main() {
    var hil =functionOverload(2001)
    hil.pemain("Budi",2018)
}
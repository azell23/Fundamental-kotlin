package Week10.Harike4

data class dataSea(val name:String,val nilai:Int,val matkul:String)
sealed class matematika(val name: String)
class tambah :matematika("Tambah")
class kurang :matematika("Kurang")

fun aritmatik(bil1:Int,bil2:Int,operasi:matematika):Int{
    return when (operasi){
        is tambah -> bil1 + bil2
        is kurang -> bil1 - bil2
    }
}
class out(val wali: String){ //outer class

    inner class inn(val name: String){ //inner class
        fun hi()= println("Nama: $name, Wali kelas: ${this@out.wali}")
    }
}

interface user{
    fun username()
}
fun username(name :user){
    name.username()
}
enum class usia(val keterangan:String) {
    anak("Anak Usia 5 sampai 11"),
    remaja("Remaja Usia 12 sampai 25"),
    dewasa("Dewasa Usia 26 sampai 50");

    fun deskripsi()= println(keterangan)
}
fun main() {
    val hil=dataSea("Rizky",81,"MTK")
    val hil2=hil.copy(nilai = 80,matkul = "Kalkulus")
    println(hil)
    println(hil2)
    println(aritmatik(10,20,tambah()))
    println(aritmatik(130,20,kurang()))
    val dan=out("Rizky")
    val mail=dan.inn("Ismail")
    mail.hi()
    username(object : user{
        override fun username()= println("hildann")
    })
    val anak=usia.anak
    val remaja=usia.remaja
    val dewasa=usia.dewasa
    val semua:Array<usia> =usia.values()
    println(anak)
    println(remaja)
    println(dewasa)
    println(semua.toList())
    anak.deskripsi()
    remaja.deskripsi()
    dewasa.deskripsi()
}

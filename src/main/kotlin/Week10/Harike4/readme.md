## Data class
Adalah class yang secara otomatis membuatkan 3 function(toString,hashCode,equals) dan mengcopy semua propreties yang ada pada primary constructor pada data class.
Data class juga memiliki function copy yang digunakan untuk menduplikasi object,bahkan function tersebut bisa mengcopy sekaligus mengubah propertiesnya.
```
data class dataSea(val name:String,val nilai:Int,val matkul:String) 
fun main() {
    val hil=dataSea("Rizky",81,"MTK")
    val hil2=hil.copy(nilai = 80,matkul = "Kalkulus")
}
```
## Sealed class
Class yang di desain untuk inheritance(pewarisan).sealed class tidak bisa diinstansiasi menjadi object,karena sealed class secara standart adalah abstract class.
Sealed class cocok untuk dijadikan class parent.Sealed class sangat berguna saat menggunakan when expression sehingga kita bisa membatasi hanya class turunannya yang perlu di check.
```
sealed class matematika(val name: String)
class tambah :matematika("Tambah")
class kurang :matematika("Kurang")
fun aritmatik(bil1:Int,bil2:Int,operasi:matematika):Int{
    return when (operasi){
        is tambah -> bil1 + bil2
        is kurang -> bil1 - bil2
    }
}
fun main() {
    println(aritmatik(10,20,tambah()))
    println(aritmatik(130,20,kurang()))
}
```
##Inner class
Adalah class(inner) di dalam class(outer).Secara default,Class inner tidak bisa mengakses data yang ada di dalam class outer.Agar class inner bisa mengakses data class outer ,bisa menggunakan kata kunci inner.
```
class out(val wali: String){ //outer class

    inner class inn(val name: String){ //inner class
        fun hi()= println("Nama: $name, Wali kelas: ${this@out.wali}")
    }
}
fun main() {
    val dan=out("Rizky")
    val mail=dan.inn("Ismail")
    mail.hi()
}
```
## Anonymous class
Kemampuan membuat object dari class yang deklarasinya belum lengkap(Abstract class atau interface).Untuk membuat anonymous class bisa menggunakan kata kunci object diikuti dengan deklarasi dari class childnya seperti pada pewarisan.
```
interface user{
    fun username()
}
fun username(name :user){
    name.username()
}
fun main(){
    username(object : user{
        override fun username()= println("hildann")
    })
}
```

## Enum class
Adalah class yang digunakan untuk jenis data yang sudah baku nilainya seperti jenis kelamin,arah mata angin atau yang lainnya.
Untuk membuat Enum class bisa menggunakan kata kunci enum sebelum deklarasi class nya.Saat membuat class enum kita bisa harus deklarasikan data apa saja yang diperlukan.
```
enum class usia {
    anak,remaja,dewasa
}
fun main() {
    val anak=usia.anak
    val remaja=usia.remaja
    val dewasa=usia.dewasa
    val semua:Array<usia> =usia.values()
    println(anak)
    println(remaja)
    println(dewasa)
    println(semua.toList())
}
```
Enum class bisa memiliki properties dan function seperti class pada umumnya.Namun jika propertiesnya di set menggunakan constructor ,maka saat pembuatan object enum wajib diisi,dan jika terdapat abstract function, wajib di override.
```
enum class usia(val keterangan:String) {
    anak("Anak Usia 5 sampai 11"),
    remaja("Remaja Usia 12 sampai 25"),
    dewasa("Dewasa Usia 26 sampai 50");

    fun deskripsi()= println(keterangan
}
fun main(){
    val anak=usia.anak
    val remaja=usia.remaja
    val dewasa=usia.dewasa
    anak.deskripsi()
    remaja.deskripsi()
    dewasa.deskripsi()
```
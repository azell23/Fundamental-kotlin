## This Keyword(Kata kunci this)
This digunakan untuk mereferensikan objek saat ini,jadi saat kita ingin memanggil diri sendiri di dalam objek kita bisa menggunakan kata kunci this.
This hanya bisa digunakan di dalam class atau object.This juga biasanya digunakan untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama.
```
class functionOverload(var tahun:Int) {
    fun pemain(nama:String,tahun: Int){
        println("Nama :$nama kelahiran $nama tahun :${this.tahun} peresmian tim pada tahun :$tahun" )
    }
}
```
Pada source code diatas terdapat class bernama functionOverload memiliki properties tahun,kemudian ada function dengan parameter nama dan tahun.
Terdapat kesamaan nama parameter antara function dan class,jika kita ingin memanggil parameter yang ada di properties class kita bisa menggunakan kata kunci this.
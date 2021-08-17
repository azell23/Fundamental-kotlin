## Visibility Modifier
Visibility modifier bisa dimiliki oleh class,interface,constructor,function,dan properties(termasuk getter dan setter).Secara default visibility dari class,interface atau yang lainya adalah public.
Visibility modifier adalah cara pengaksesan sebuah class,interface atau yang lainnya,ada 4 visibility di kotlin yaitu, public,private,protected, dan internal

|Visibility Modifier|Keterangan|
|-------------------|----------|
|Public|Bisa diakses dari manapun|
|Private| Hanya bisa diakses di tempat deklarasinya|
|Protected| Hanya bisa diakses di tempat deklarasi dan juga turunannya|
|Internal|Hanya bisa diakses di project yang sama|

## Extension Function
Menambahkan function pada type data yang sudah ada.Extension bukanlah function di class,saat membuat extension function, kita tidak mengubah class aslinya,kita juga
tidak bisa mengakses data private atau protected dari class tersebut.
```
class extensionfun(val name: String,private val umur:Int)
fun extensionfun.identitas(){
    println("Nama ${this.name.uppercase()} dan Umur ${this.umur}")
}
```
source code tersebut akan error karena extension function tidak bisa mengakses data yang di private atau protected.
### Nullable Extension
Jika kita ingin membuat function dengan data yang bisa null kita bisa menggunakan tanda tanya(?) sebagai kata kunci.Atau kita bisa
menggunakan if untuk melakukan pengecekan

## Extension Properties
Untuk membuat Extension properties kita perlu membuat properties dengan getter dan setter,jadi tidak bisa membuat extension properties saja.
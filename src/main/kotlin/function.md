##Function
Blok kode yang sengaja dibuat agar bisa digunakan berulang ulang.Function yang wajib dibuat agar program kotlin dapat berjalan,yaitu function main.

Function dapat dieksekusi dengan memanggilnya menggunakan kata kunci nama functionnya
```kotlin
fun nama() {
    println("Mail")
}
fun main() {
    nama()
}
```
##Function parameter

```
fun nilai(nilai1: Int, nilai2: Int){
    println("UTS $nilai1 UAS $nilai2")
}

fun main() {
    nilai(80,85)
}
```
##Function default argument
Pada function parameter wajib diisi ketika memanggil function,namun kita bisa memasukan nilai default pada parameter,jadi saat memanggil function tersebut ,tidak wajib memasukan nilai pada parameternya.
```
fun name(firstname: String, lastname: String ="I") {
    println("$firstname $lastname")
}

fun main() {
    name("mail")
    name("mail", "Ismail")
}
```
##Function named argument
Jika ada function yang memiliki banyak parameter,kita akan kesulitan saat memanggil function tersebut,kita harus tahu urutan parameter di function tersebut.

Ada fitur named argument yang bisa menyebutkan nama parameter saat memanggil function.
```aidl
fun angka(angka1: Int,
          angka2: Int,
          angka3: Int,
          angka4: Int,
          angka5: Int,){
    println("angka ke 1 = $angka1 " +
            "angka ke 2 = $angka2 " +
            "angka ke 3 = $angka3 " +
            "angka ke 4 = $angka4 " +
            "angka ke 5 = $angka5 ")
}

fun main() {
    angka(angka1 = 10,angka2 = 20,angka3 = 30,angka5 = 50,angka4 = 40)
}
```
##Unit returning function
Function ada 2 jenis,tidak mengembalikan data dan mengembalikan data,ketika kita membuat function, secara default 
dia mengembalikan tipe data Unit,dimana unit adalah tanda bahwa function tersebut tidak mengembalikan data 
> penulisan unit dalam function tidak wajib
##function return type
Digunakan untuk mengembalikan data
```aidl
fun bagi(a:String, b:Int):String {
    if (b<=10){
        return "bocil"
    }else{
        val c="nama = $a umur = $b "
        return c
    }
}

fun main() {
    println(bagi("mail",0))
    println(bagi("ismail",12))
}
```
##Single expression function
Ketika ingin membuat function yang sederhana misalnya hanya 1 baris,kita bisa mengubahnya ke single expression function

single expression function adalah deklarasi function hanya dengan satu baris,untuk menggunakannya hanya butuh tanda = setelah deklarasi nama function dan tipe data pengembalian function
```
fun single(a:String,b:Int)= println("NAMA = $a umur = $b ")

fun main() {
    single("mail",15)
}
```
##Function Varargs parameter

Parameter yang berada di posisi terakhir memiliki kemampuan varargs,varargs artinya datanya bisa menerima lebih dari satu input,sama seperti array
- jika parameter tipe array,wajib membuat array terlebih dahulu sebelum mengirimkan ke function
- jika parameter menggunakan varargs,kita bisa langsung mengirim datanya,jika lebih dari satu cukup gunakan koma
```
fun array(vararg angka:Int):Int{
    var a=0
    for (i in angka){
        a+=i
    }
    return a
}
fun main() {
    println(array(10,10,10,10))
}
```
##Extension Function
Kemampuan menambahkan function pada tipe data yang sudah ada.Uuntuk membuat cukup menambahkan tipe data pada nama functionya,lalu diikuti tanda titik.
jangan terlalu banyak digunakan,karena aka membuat program sulit dimengerti. Untuk mengakses dapat menggunakan kata kunci this
```
fun String.helo() =println("Hello $this")
fun main() {
    val name: String ="Hildan"
    println(name.helo())
}
```
##Function Infix Notation
Operasi yang biasa dilakukan di operasi matematika,dimana ini melakukan operasi terhadap 2 data.

Syarat Function Infix Notation
- Harus sebagai function atau function extension
- harus memiliki 1 parameter
- parameter tidak boleh varargs dan tidak memiliki nilai default
```
infix fun String.to(type:String):String{
    if(type == "UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }

}
fun main() {
    val name1 ="Rizky" to "UP"
    println(name1)
}
```
##Function Scope
Ruang lingkup dimana sebuah function bisa diakses,jika ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu,maka kita membuat function di dalam function
```
fun main() {
    fun namaa(name:String){
        println("Nama $name")
    }
    namaa("Ramadhan")
}
```

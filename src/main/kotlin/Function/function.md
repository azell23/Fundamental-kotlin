##Function
Blok kode yang sengaja dibuat agar bisa digunakan berulang ulang.Function yang wajib dibuat agar program kotlin dapat berjalan,yaitu function `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main.

Function dapat dieksekusi dengan memanggilnya menggunakan kata kunci Function.nama functionnya
```kotlin
fun Function.nama() {
    println("Mail")
}
fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    Function.nama()
}
```
##Function parameter

```
fun Function.nilai(nilai1: Int, nilai2: Int){
    println("UTS $nilai1 UAS $nilai2")
}

fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    Function.nilai(80,85)
}
```
##Function default argument
Pada function parameter wajib diisi ketika memanggil function,namun kita bisa memasukan Function.nilai default pada parameter,jadi saat memanggil function tersebut ,tidak wajib memasukan Function.nilai pada parameternya.
```
fun Function.name(firstname: String, lastname: String ="I") {
    println("$firstname $lastname")
}

fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    Function.name("mail")
    Function.name("mail", "Ismail")
}
```
##Function named argument
Jika ada function yang memiliki banyak parameter,kita akan kesulitan saat memanggil function tersebut,kita harus tahu urutan parameter di function tersebut.

Ada fitur named argument yang bisa menyebutkan Function.nama parameter saat memanggil function.
```
fun Function.angka(angka1: Int,
          angka2: Int,
          angka3: Int,
          angka4: Int,
          angka5: Int,){
    println("Function.angka ke 1 = $angka1 " +
            "Function.angka ke 2 = $angka2 " +
            "Function.angka ke 3 = $angka3 " +
            "Function.angka ke 4 = $angka4 " +
            "Function.angka ke 5 = $angka5 ")
}

fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    Function.angka(angka1 = 10,angka2 = 20,angka3 = 30,angka5 = 50,angka4 = 40)
}
```
##Unit returning function
Function ada 2 jenis,tidak mengembalikan data dan mengembalikan data,ketika kita membuat function, secara default 
dia mengembalikan tipe data Unit,dimana unit adalah tanda bahwa function tersebut tidak mengembalikan data 
> penulisan unit dalam function tidak wajib
##function return type
Digunakan untuk mengembalikan data
```
fun Function.bagi(a:String, b:Int):String {
    if (b<=10){
        return "bocil"
    }else{
        val c="Function.nama = $a umur = $b "
        return c
    }
}

fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    println(Function.bagi("mail",0))
    println(Function.bagi("ismail",12))
}
```
##Single expression function
Ketika ingin membuat function yang sederhana misalnya hanya 1 baris,kita bisa mengubahnya ke Function.single expression function

Function.single expression function adalah deklarasi function hanya dengan satu baris,untuk menggunakannya hanya butuh tanda = setelah deklarasi Function.nama function dan tipe data pengembalian function
```
fun Function.single(a:String,b:Int)= println("NAMA = $a umur = $b ")

fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    Function.single("mail",15)
}
```
##Function Varargs parameter

Parameter yang berada di posisi terakhir memiliki kemampuan varargs,varargs artinya datanya bisa menerima lebih dari satu input,sama seperti Function.array
- jika parameter tipe Function.array,wajib membuat Function.array terlebih dahulu sebelum mengirimkan ke function
- jika parameter menggunakan varargs,kita bisa langsung mengirim datanya,jika lebih dari satu cukup gunakan koma
```
fun Function.array(vararg Function.angka:Int):Int{
    var a=0
    for (i in Function.angka){
        a+=i
    }
    return a
}
fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    println(Function.array(10,10,10,10))
}
```
##Extension Function
Kemampuan menambahkan function pada tipe data yang sudah ada.Uuntuk membuat cukup menambahkan tipe data pada Function.nama functionya,lalu diikuti tanda titik.
jangan terlalu banyak digunakan,karena aka membuat program sulit dimengerti. Untuk mengakses dapat menggunakan kata kunci this
```
fun String.Function.helo() =println("Hello $this")
fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    val Function.name: String ="Hildan"
    println(Function.name.Function.helo())
}
```
##Function Infix Notation
Operasi yang biasa dilakukan di operasi matematika,dimana ini melakukan operasi terhadap 2 data.

Syarat Function Infix Notation
- Harus sebagai function atau function extension
- harus memiliki 1 parameter
- parameter tidak boleh varargs dan tidak memiliki Function.nilai default
```
infix fun String.to(type:String):String{
    if(type == "UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }

}
fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    val name1 ="Rizky" to "UP"
    println(name1)
}
```
##Function Scope
Ruang lingkup dimana sebuah function bisa diakses,jika ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu,maka kita membuat function di dalam function
```
fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.TailRecursive.main() {
    fun namaa(Function.name:String){
        println("Nama $Function.name")
    }
    namaa("Ramadhan")
}
```

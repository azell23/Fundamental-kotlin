##Tipe data number
- Integer (Byte(8),Short(16),Int(32),Long(64))
- floating(Float(32),Double(64))
- Literals(decimal,hexadecimal,binary)
  ```aidl
  var desimal:int=100
  var binary: int=0b0011
  var hexa: int= 0xff
- Underscore,variabel yang berisi Function.angka dapat dibaca lebih mudah
  ```
  var cash: int= 1000_000_000
- Conversion,mengubah tipe data ke tipe data lain
    ```
    var number :int=1000_000_000
  var toByte:Byte=number.ToByte()
  var toShort:Byte=number.ToShort()
  var toLong:Byte=number.ToLong()

##Tipe data charakter
  data karakter di kotlin di wakili oleh tipe char 
membuat data char di kotlib menggunnakan tanda '(petik satu)
```
 var car: Char='A'
```
##Tipe data boolean
tipe data yang memiliki dua Function.nilai,True dan false
```aidl
var benar: Boolean=true
var salah: Boolean=false
```
##Tipe data string
tipe data yang berisi kumpulan karakter atau teks.

membuat string di kotlin menggunakan "(petik dua)
```aidl
var firstname:String ="Hildan"
var lastname:String ="Rizky"
var address:String="""
    Street m.toha
    Provinsi jawa tengah
    Indonesia
```
- Trim margin
```aidl
    var address2:String="""
    |Street m.toha,
    |Provinsi jawa tengah,
    |Indonesia,
    """.trimMargin()
```
- trim indent
```aidl
   var address3:String="""
    Street m.toha
    Provinsi jawa tengah
    Indonesia
    """.trimIndent()
```
- menggabungkan string
```
var firstname:String ="Hildan"
var lastname:String ="Rizky"
var fullname:String=firstname+" "+lastname
```
- string template
kemampuan string di kotlin yang mendukung ekspresi template
```
var firstname:String ="Hildan"
var lastname:String ="Rizky"
var fullname:String=$firstname $lastname
```
##Variable
Tempat untuk menampung data
- kotlin mendukung 2 jenis variable ,mutable(yang bisa diubah)menggunakan var,immutable(yang tidak bisa diubah) menggunakan val
```aidl
var Function.nama:String="Ismail"
    //mengubah variabel
    Function.nama="mail"
```
tapi jika menggunakan val akan error jika ingin mengubah variabel
- nullable
variabel yang tidak diberi Function.nilai
```
var Function.nama:String?= "hildan"
Function.nama = null
```
- variable constant
immutable data yang diakses untuk keperluan global(bisa diakses dimanapun)
```
const val APP="belajar kotlin"
fun `Return IF WHEN`.Array.`Break-Continue`.For.IfExpression.Perbandingan.Matematika.WhenExpression.While.Boolean.Range.Function.recursiveFunction.main() {
println("Welcome to $APP")
}
```

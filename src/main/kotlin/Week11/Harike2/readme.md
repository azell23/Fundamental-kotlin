## Destructuring Declaration
Membuat banyak variable dalam satu waktu.Kotlin memungkan untuk mendeklarasikan banyak variabel dalam satu waktu.
Destructuring tidak bisa dilakukan pada semua object hanya object yang memiliki function componentX() yang bisa dilakukan destructuring.
Kita bisa menghiraukan variable lainnya saat ingin melakukan destructuring,dengan menggunakan underscore(_)
Destructuring juga bisa digunakan ketika memanggil function,Dengan ini kita bisa mengembalikan multiple-return pada function.
Destructuring juga bisa dilakukan pada lambda parameter,hal ini mempermudah saat ingin mengakses data yang ada di parameter.

## Operator Overloading
Membuat function dari operator seperti operator aritmatika atau yang lainnya.Kemampuan ini membuat bisa melakukan operasi di object seperti layaknya operasi tipe data integer.
Untuk membuat operator overloading bisa menggunakan kata kunci operator sebelum mendeklarasi functionnya
### Unary prefix operator
|Expression|Translated to|
|----------|-------------|
|+a|a.unaryPlus()|
|-a|a.unaryminus()|
|!a|a.unaryNot()|
### Increment and Decrement
|Expression|Translated to|
|----------|-------------|
|a++|a.inc()+see below|
|a--|a.dec()+see below|
### Aritmatik Operator
|Expression|Translated to|
|----------|-------------|
|a+b|a.plus(b)|
|a-b|a.Minus(b)|
|a*b|a.Times(b)|
|a/b|a.div(b)|
|a%b|a.rem(b),a.mod(b) (deprecated)|
|a..b|a.rangeto(b)|
### In Operator
|Expression|Translated to|
|----------|-------------|
|a in b|b.constaint(a)|
|a!in b|!b.constaint(a)|

## Null Safety
Error jenis NullPointerException terjadi karene saat mengakses properties atau funcion yang bernilai null.Di kotlin jarang terjadi karena kotlin tidak merekomendasikan
nullable type.Jika ingin menggunakan nullale kita bisa memberitahu dengan karakter ?(tanda tanya).Ada beberapa cara untuk menghindari error dari null.
- Checking for null
```
 fun Check(){
        if (nama != null){
            println("Tidak Null")
        }
    }
```
- safe call menggunakan ?
```
class check(val nama:String)
fun check2(name: check?){
    val name = name?.nama
    println("hello $name")
}
```
- Elvis operator
```
class check(val nama:String)
fun check2(name: check?){
    val name = name?.nama ?:""
    println("hello $name")
}
```
- !! operator
Digunakan jika yakin bahwa variable tidak akan null,jika variabel tersebut null maka akan terjadi error.
Kita bisa menggunakan !! untuk mengkonversi data yang nullable menjadi tidak nullable

## Exception
Error dikotlin direpresentasikan dengan exception.Ada banyak jenis error yang terduga seperti validation error atau yang tidak terduga seperti jaringan atau database error.
Semua tipe data error pasti akan selalu class turunan dari Throwable.Di kotlin bisa membuat error dengan menggunakan kata kunci throw diikuti dengan object errornya.
### Try catch
Jika terjadi exception pada program,maka program tersebut akan berhenti,Di kotlin kita bisa menangkap exception lalu melakukan sesuatu jika terjadi error .
Try catch digunakan untuk melakukan sesuatu ketika program mengalami exception(memberikan reaksi) sesuai yang kita mau.
Jika ada kemungkinan terjadi lebih dari satu jenis exception kita bisa menggunakan multiple block catch untuk menangkap jenis exception yang berbeda.
Ada juga block code yang bisa ditambahkan yaitu finally ,block tersebut akan di selalu di eksekusi setelah code program try catch di eksekusi,baik sukses atau gagal.


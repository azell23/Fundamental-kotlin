##When Expression
Selain if expression,untuk melakukan percabangan bisa juga menggunakan when expression.

When expression lebih sederhana dibanding if.

When expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variabel.
```aidl
val nilai ='A'
when (nilai) {
    'A'-> println("amazing")
    'B'-> println("good")
    'C'-> println("not bad")
    else -> println("try again")
```

###When expression multiple option
```aidl
val nilai2 ='A'
when (nilai2) {
    'A','B','C' -> println("lulus")
    else -> println("gagal")
```
###When expression In
```aidl
val nilai = 'A'
val lulus= arrayOf('A','B','C')
when (nilai) {
        in lulus -> println("lulus")
        !in lulus -> println("Gagal")
```
###When expression Is
```aidl
val nilai = 'A'
when (nilai) {
    is Char -> println("Nilai bertipe data char")
    !is Char -> println("Nilai tidak bertipe data char")
```
###When pengganti if else
Selain digunakan untuk pengecekan variabel,When juga dapat digunakan sebagai pengganti if else,untuk mengganti if else dengan when,tidak perlu menggunakan variabel dalam when
```aidl
val nilai2 = 80
when{
     nilai2 >90 -> println("Bagus")
     nilai2 >75 -> println("Belajar lagi")
     else -> println("Remidi")
```
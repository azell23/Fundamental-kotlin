##If Expression
If digunkan sebagai kata kunci untuk percabangan,kita bisa mengeksekusi program tertentu ketika suatu kondisi terpenuhi
```aidl
val nilai = 80
if (nilai >75) {
    println("Bagoosss")
}
```
##Else Expression
If akan dieksekusi ketika if bernilai true,jika kita ingin menghasilakn nilai false maka bisa menggunakan else 
```aidl
val nilai = 80
if (nilai >75) {
    println("Bagoosss")
}
else{
    println("Belajar lagi")
}
```
##Else If Expression
Digunakan untuk membuat beberapa kondisi
```aidl
val nilai = 80
if (nilai >75) {
    println("Bagoosss")
}
else if(nilai < 70)
    println("remidi")
else{
    println("Belajar lagi")
}
```
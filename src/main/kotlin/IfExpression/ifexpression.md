##If Expression
If digunkan sebagai kata kunci untuk percabangan,kita bisa mengeksekusi program tertentu ketika suatu kondisi terpenuhi
```aidl
val Function.nilai = 80
if (Function.nilai >75) {
    println("Bagoosss")
}
```
##Else Expression
If akan dieksekusi ketika if bernilai true,jika kita ingin menghasilakn Function.nilai false maka bisa menggunakan else 
```aidl
val Function.nilai = 80
if (Function.nilai >75) {
    println("Bagoosss")
}
else{
    println("Belajar lagi")
}
```
##Else If Expression
Digunakan untuk membuat beberapa kondisi
```aidl
val Function.nilai = 80
if (Function.nilai >75) {
    println("Bagoosss")
}
else if(Function.nilai < 70)
    println("remidi")
else{
    println("Belajar lagi")
}
```
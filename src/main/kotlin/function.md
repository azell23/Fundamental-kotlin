##Function
Blok kode yang sengaja dibuat agar bisa digunakan berulang ulang.Function yang wajib dibuat agar program kotlin dapat berjalan,yaitu function main.

Function dapat dieksekusi dengan memanggilnya menggunakan kata kunci nama functionnya
```aidl
fun nama() {
    println("Mail")
}
fun main() {
    nama()
}
```
##Function parameter

```aidl
fun nilai(nilai1: Int, nilai2: Int){
    println("UTS $nilai1 UAS $nilai2")
}

fun main() {
    nilai(80,85)
}
```
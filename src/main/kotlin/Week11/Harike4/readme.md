## Scope Function
kotlin memiliki standar library yang berisi bberapa function yang bisa digunakan untuk mengeksekusi object dengan mudah via Lambda Expression.

Jenis function,
- let 

Digunakan sebagai reference block agar lebih mudah ketika memanipulasi object.Function ini memiliki parameter object itu sendiri,sehingga bisa menggunakan kata kunci it agar mndapatkan referensi terhadapa object tersebut.
- run 

Mirip dengan let,bedanya hanya run tidak memiliki parameter di dalam lambda nya,sehingga tidak bisa menggunakan kata kunci it namun masih bisa menggunakan kata kunci this.
- apply

Mirip dengan run,bedanya return value dari apply funnction adalah reference object itu sendiri.
- also

mirip dengan let,bedanya return value nya adalah reference ke object itu sendiri.

- With : Function

mirip dengan run yang menggunakan this,bedanya with bukanlah extension function ,jadi tidak bisa digunakan langsung dari objectnya,harus dipanggil secara manual.

## Polymorphism
kemampuan sebuah object yang dapat berubah bentuk.Polymorphism erat hubungannya dengan inheritance.
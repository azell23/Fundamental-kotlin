
## Recursive Function
Recursive function adalah function yang memanggil dirinya sendiri.Terkadang kita menemukan study kasus yang lebih mudah saat mengunakan recursive function ketimbang tidak menggunakannya.
Setiap fungsi rekursif harus memiliki kondisi berhenti dari perulangan jika tidak, eksekusi program masuk dalam infinite loop.
Saat menggunakan recursive function diperhatikan agar saat function tersebut memanggil dirinya sendiri tidak terlalu dalam,
jika function tersebut memanggil dirinya sendiri terlalu dalam maka akan terjadi error stack overflow. 

Recursive function bisa digunakan oleh banyak bahasa tidak hanya kotlin.
## Tail Recursive Function
Tail recursive function digunakan untuk mengatasi masalah saat recursive function mengalami error stack overflow.
Cara kerja dari Tail recursive function adalah mengubah recursive function menjadi looping biasa saat dijalankan.

Syarat agar bisa menggunakan Tail Recurive Function
- Menambahkan kata kuci tailrec di functionnya
- saat memanggil function ,hanya memanggil functionnya dirinya sendiri tanpa ada tambahan operasi lain.contohnya,
- [x] factorialrecursive(value-1)
- [ ] value*factorialrecursive(value-1)


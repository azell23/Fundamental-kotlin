## Closure
Adalah kemamampuan interaksi sebuah function(Lambda,Anonymous) dengan data data disekitarnya dengan scope yang sama.Berhati hati saat menggunakan
kemampuan tersebut karena dapat mengubah variiabel lain tanpa sengaja.
## InlineFunction
Adalah kemampuan menduplikat code Higher order function agar saat dijalankan tidak membuat objek lambda secara berulang.
Penggunaan Higher-order function dapat menurunkan performa saat dijalankan karena saat membuat higher0order function di java dia menjadi objek java dan ketika
kita memanggil higher order itu akan meembuat objek secara berulang ulang,kalau penggunaanya sedikit mungkin tidak akan terasa impactnya tapi kalu penggunaannya banyak maka akan terasa impactnya.
Untuk mendeklarasikan itu adalah inlineFunction cukup menambahkan kata kunci inline di depan fun,kalu dilihat secara sourcode memang tidak ada perubahan,tapi jika dilihat byte code yang sudah di decompile maka akan terlihat perbedaannya.

### noInline
saat kita mendekalrasikan function sebagai inline function maka secara otomatis semua parameter akan menjadi inline,Untuk menandai ada parameter yang jangan inline maka bisa ditambahkan di depan parameter dengan kata kunci noinline.
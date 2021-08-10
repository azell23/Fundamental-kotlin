## Type Check and Cast
Saat kita butuh pengecekan tipe data atau bahkan melakukan konversi data,kita bisa melakukannya di dalam OOP karna kita akan bertemu banyak sekali tipe data(class) dan pewarisan(inheritance).
### Operator is dan !is/home/hildan/IdeaProjects/coba
- is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
- !is digunakan untuk melakukan pengecekan aoakah sebuah data bukan merupakan tipe data tertentu

Kotlin memiliki mekanisme konversi data secara otomatis saat melakukan pengecekan menggunakan is,saat tipe data yang dicek maka secara otomatis akan berubah menjadi tipe data yang di cek
### Unsafe casts
Jika kita ingin memaksa konversi data kita bisa menggunakan kata kunci as,namun konversi ini tidak aman karena tidak aman jika ternyata tipe datanya tidak sesuai.
Kita bisa membuat kata kunci as menjadi aman dengan menggunakan kata kunci as? jika konversi gagal tidak akan menyebabkan error namun akan menjadi null.
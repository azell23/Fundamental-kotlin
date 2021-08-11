## toString Function
Digunakan untuk memberitahu representasi string dari object.Saat ingin melakukan println object sebenarnya function tostring akan dipanggil dan biasanya output dari toString adalah nama package diikuti oleh class nya kemudian ada kdoe unik dari object tersebut.
Kita bisa mengubah representasi dari string pada object kita dengan cara meng override function toString().
## Equals Function
Di kotlin,kita bisa membandingkan object dengan operasi == atau !=.Saat kita membandingkan object ,di kotlin kita menggunakan function equals milik class any.
Default nya pada kotlin saat kita membandingkan dua object dengan nama yang berbeda namun isinya nilainya sama dengan operasi == maka hasilnya false,untuk mengubah cara membandingkannya kita bisa meng override function equals milik class any.
## HashCode Function
Digunakan untuk representasi angka untuk object yang kita buat.Function ini berguna saat kita ingin mengkonversi object menjadi angka.
salah satu kegunaan HashCode adalah untuk memastikan tidak ada duplicate data.
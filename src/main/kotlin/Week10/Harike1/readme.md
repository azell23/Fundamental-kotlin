## Getter and Setter
- Getter adalah function yang dibuat untuk mengambil data properties.
- Setter adalah untuk mengubah data propeties.

Di kotlin sebenarnya kita tidak perlu membuat function getter dan setter karena sudah di fasilitasi sehingga lebih mudah.

Getter dan setter juga tidak wajib di deklarasikan semua di kotlin,kita bisa mendeklarasi hanya getter atau setter saja atau jika mau keduanya juga tidak masalah.

## Late-initialized Properties
Properties di kotlin wajib diinisialisasi di awal saat deklarasi properties tersebut,namun jika kita ingin menunda inisialisasi data dari properties kita bisa menggunakan
kata kunci lateinit,lateinit hanya bisa digunakan di var,tidak bisa di val.

lateinit kadang berbahaya karena saat di compile tidak menampilkan error tapi saat di run akan terjadi error.Jadi kita harus mengisi value dari properties dahulu sebelum melakukan running.
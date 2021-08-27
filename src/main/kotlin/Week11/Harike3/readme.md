## Annotation
Menambahkan informasi tambahan ke kode yang dibuat.Annotation biasanya digunakan saat ingin membuat library atau framework selain dari itu biasanya annotation tidak berguna.Annotation bisa diakses menggunakan reflection .
Membuat class annotation bisa menggunakan kata kunci annotation.Annotation hanya boleh memiliki propetris via primary constructor ,tidak boleh memiliki properties atau function di body.

|Attribute|Keterangan|
|---------|----------|
|@Target|Memberitahu annotation bisa digunakan dimana? Class,function,properties, dan lain lain.|
|@Retention|Memberitahu annotation apakah disimpan di hasil kompilasi,dan apakah bisa dibaca oleh reflection|
|@Repeatable|Memberitahu annotation bisa digunakan lebih dari sekali target yang sama|
|@MustBeDocumented|Memberitahu annotation apakah perlu di dokumentasikan di public API|

Retention ada 3 jenis
- Retention source = hanya ada di source code,ketika di compile akan hilang
- Retention Binary = ketika di compile ada di kompilasinya
- Retention Runtime = Hasilnya di compile masuk ke kompilasi dan bisa dibaca reflection

## Annotation target
saat kita ingin menempatkan posisi annotation sesuai dengan kita mau agar bisa terbaca baik oleh java.
Karena sedikit berbeda dengan yang ada di java seperti tidak adanya constructor pada java,maka kadang itu menjadi masalah bagi kotlin ketika menggunakan framework java,sehingga target lokasi annotationnya harus sesuai dengan yang biasa digunakan framework tersebu di java.
Di kotlin bisa menggunakan @target:namaAnnotationnya untuk menentukkan lokasi target annotation akan ditempatkan dimana.

## reflection
Kemampuan melihat struktur aplikasi saat berjalan(Runtime).Biasanya digunakan ketika ingin membuat library atau framework.Reflection sangat berguna karena bisa mengotomatisasi pekerjaan.Mengakses reflection class dari sebuah object ,kita bisa menggunakan kata kunci ::class,atau bisa langsung dati Namaclass::class
## Inline Class
Ketika ingin membuat class hanya dengan satu properties kita bisa menggunakan inline class.keuntungan dari inline class adalah memperkecil memory saat program dijalankan.
Karena terlalu banyak class akan menkonsumsi lebih banyak memory.Kita bisa mengubah class biasa menjadi inline class dengan menggunakan kata kunci inline.

##Delegation
Delegation secara sederhana adalah meneruskan properties atau function ke object lain.Saat kita ingin membuat class yang extend dengan interface maka kita harus mengextend semua function atau properties,dengan delegation kita bisa meneruskan ke object lain tanpa menulis ulang function atau properties tersebut.Kotlin mendukung agar saat ingin meneruskan function atau properties tanpa harus membuat kode secara manual

#### Ini jika secara manual
```
interface dele{
    fun hi(name:String)
    fun bye(name: String)
}
class delegasi:dele{
    override fun bye(name: String) {
        println("bye $name")
    }

    override fun hi(name: String) {
        println("hi $name")
    }
}
class mydelegasi(val dan:dele):dele{
    override fun bye(name: String) {
        dan.bye(name)
    }

    override fun hi(name: String) {
        dan.hi(name)
    }
}
fun main() {
    val dan=delegasi()
    dan.bye("budi")
    val riz=mydelegasi(dan)
    riz.bye("ismail")
```
#### Ini secara otomatis
```
interface dele{
    fun hi(name:String)
    fun bye(name: String)
}
class delegasi:dele{
    override fun bye(name: String) {
        println("bye $name")
    }

    override fun hi(name: String) {
        println("hi $name")
    }
}
class mydelegasi(val dan:dele):dele by dan
fun main() {
    val dan=delegasi()
    dan.bye("budi")
    val riz=mydelegasi(dan)
    riz.bye("ismail")
```

## lazy Properties
Delegation tidak hanya pada class,namun bisa juga pada properties.Lazy properties adalah salah satu implementasi delegation pada properties.
Lazy adalah library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses.
Lazy properties hanya akan di inisialisasi ketika akan dipanggil pertama.

## Observable Properties
Selain lazy properties library yang disediakan oleh kotlin untuk mendelegasi properties adalah observable properties.
Menggunakan observable properties kita bisa tahu value sebelum diubah dan setelah diubah.Saat menggunakan observable harus menggunakan var.
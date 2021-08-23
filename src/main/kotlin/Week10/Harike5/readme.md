## Singleton Object
Adalah object yang hanya dibuat sekali.Singleton object mirip dengan class bisa extend class ataupun extend interface, namun tidak bisa memiliki constructor.
Membuat singleton object cukup menggunakan kata kunci object.Saat ada perubahan data itu akan ngimpact ke semua.Singleton object juga bisa dibuat didalam class ini dinamakan Inner object.Singleton object tidak bisa mengakses properties atau function yang ada di outer class nya.

```
object Singleton {
    val name="IsMAIl"
    fun lower(value:String):String{
        return value.lowercase()
    }
}
class innerobject() {
    object Singleton {
        val name = "IsMAIl"
        fun lower(value: String): String {
            return value.lowercase()
        }
    }
}
fun main() {
    println(Singleton.lower("ISMAIL"))
    println(innerobject.Singleton.name)
```
## Companion Object
Kemampuan membuat inner object tanpa menggunakan nama.Ini biasanya digunakan saat nama class dengan object sama.Companion object secara otomatis akan menggunakan nama Companion atau nama classnya saat ingin diakses.
```
class innerobject() {
    companion object{
        val name = "IsMAIl"
        fun uppercase(value: String): String {
            return value.uppercase()
        }
    }
}

fun main() {
println(innerobject.uppercase("ismail")) //saat ingin diakses lebih sederhana
```

## Type Alias
Membuat nama berbeda dari data yang sudah ada.Biasanya digunakan jika nama data terlalu panjang jadi kita bisa mempersingkatnya atau ada nama data yang sama jadi kita bisa  membedakannya.
type alias juga bisa digunakan pada function.Menggunakan type alias kita bisa lebih mudah saat menggunakan function sebagai parameter karena lebih sederhana.
```
typealias inobj = innerobject
typealias Stringuser = () -> String
fun user(user :Stringuser){ //Jadi ini sebelumnya seperti ini fun user(user :() -> String)
    println("Username ${user().uppercase()}")
}

fun main() {
    user ({ "Hilfsm" })
    println(inobj.uppercase("ismail"))
```
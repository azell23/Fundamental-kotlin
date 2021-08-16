## Interface
Deklarasi type tidak hanya class,di kotlin ada juga interface.Interface adalah blueprint,prototype,atau cetakan di kotlin.
Interface tidak bisa langsung dibuat sebagai object,interface hanya bisa diturunkan.Secara standart ,semua properties dan function di interface adalah abstract.
### Concreate function di interface
Di interface function memiliki pengecualian,function tidak harus abstract,kita bisa buat concreate function yang artinya function tersebut tidak wajib dibuat ulang di class childnya.
### Multiple inheritance dengan interface
Di kelas inheritance hanya boleh memiliki satu class parent,namun di interface class child boleh memiliki banyak interface parent.
### Inheritance antar interface
Kemampuan inheritance tidak hanya dimiliki oleh class,Interface juga bisa melakukan inheritance dengan interface lain,namun tidak bisa melakukan inheritance dengan class.
### Konflik di interface
Contoh konflik di interface, Ketika kita membuat dua interface dengan nama yang berbeda namun memiliki function dengan nama yang sama,akan terjadi konflik jika class mengekstend dua interface tersebut.
```
interface moveA{
    fun move()= println("Move A")
}
interface moveB{
    fun move()= println("Move B")
}
class bio(override val username: String):moveA,moveB
```
Memperbaiki konflik
```
interface moveA{
    fun move()= println("Move A")
}
interface moveB{
    fun move()= println("Move B")
}
class bio(override val username: String):moveA,moveB{
override fun move() {
        super<moveA>.move()
        super<moveB>.move()
    }
```
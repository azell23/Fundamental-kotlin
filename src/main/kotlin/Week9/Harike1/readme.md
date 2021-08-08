## Super Keyword(Kata kunci Super)
Jika kita ingin mengakses function atau properties milik class parent yang sudah dibuat ulang oleh class child,kita bisa menggunakan kata kunci super.

Super in Properties
```
open class superkey {
    val nilai=80
}
class child1 :superkey(){
    val nilai1=70
    val parentprop=super.nilai
    
fun main(){
    var dan=child1()
    println(dan.nilai1)
    println("Parent properties value = ${dan.parentprop}")
}
```
Super in Function
```
open class superkey {
   open fun nama(){
        println("Belajar kotlin")
    }
}
class child1 :superkey(){
    override fun nama() {
        println("Belajar OOP Kotlin")
        super.nama()
    }
}



fun main() {
    var dan=child1()
    dan.nama()
}
```
## Super Constructor
Tidak hanya digunakan untuk mengakses function atau properties di class parent,
kata kunci super juga dapat digunakan untuk mengakses constructor di class parent.
Saat ingin mengakses constructor di parent hanya bisa dilakukan di dalama class child.
package Week9.Harike1

open class superkey {
    val nilai=80
    open fun nama(){
        println("Belajar kotlin")
    }
}
class child1 :superkey(){
    val nilai1=70
    override fun nama() {
        println("Belajar OOP Kotlin")
        super.nama()
    }

    val parentprop=super.nilai

}



fun main() {
    var hil=superkey()
    println(hil.nilai)
    var dan=child1()
    println(dan.nilai1)
    println("Parent properties value = ${dan.parentprop}")
    dan.nama()
}
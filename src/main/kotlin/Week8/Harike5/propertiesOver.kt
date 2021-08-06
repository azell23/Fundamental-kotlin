package Week8.Harike5

open class propertiesOver {
    val nilai=80
}
class child1 :propertiesOver(){
    val nilai1=70
}
class child2 :propertiesOver(){
    val nilai2=90
}

fun main() {
    var hil=propertiesOver()
    println(hil.nilai)
    var dan=child1()
    println(dan.nilai1)
    var riz=child2()
    println(riz.nilai2)
}
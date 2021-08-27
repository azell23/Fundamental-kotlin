package Week11.Harike4

class scope(val name:String,val age:Int)

fun main() {
    val hil=scope("hildan",10)
    hil.let {
        println(it.name)
        println(it.age)
    }
    hil.run {
        println(this.name)
        println(this.age)
    }
    hil.apply {
        println(this.name)
        println(this.age)
    }
    val also:scope=scope("Katsumaru",10).also {
        println(it.name)
        println(it.age)
    }
    println(also)
    val with= with(hil){
        println(this.name)
        println(this.age)
    }
}
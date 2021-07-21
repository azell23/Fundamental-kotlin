inline fun abc(name:()->String,
               noinline lastname:()->String):String{ //menandai parameter tersebut tidak inline
    return "Hello ${name()} ${lastname()}"
}
fun main() {
    println(abc( { "Katsumaru" },{"Hildan"}))
}
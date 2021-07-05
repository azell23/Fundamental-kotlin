package For

fun main() {
    val nama = arrayOf("Hil","dan","R","i","z","k","y")
    val angka =1..10
    for (name in nama){
        println (name)
    }
    val ukurannama = nama.size - 1
    for (value in angka step 2)
        println(value)
    for (a in 0..ukurannama){
        println("Index $a = ${nama.get(a)}")
    }
}
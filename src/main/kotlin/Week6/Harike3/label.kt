fun labelbreak(){
    loopi@for (i in 1..8){
        loopj@for (j in 1..8){
            if (i>5){
                break@loopi
            }
            println("$i x $j = ${i*j}")
        }
    }
}
fun main() {
    fun nama(name: String,operasi: (String) -> Unit):Unit = operasi(name)
    nama("Katsumaru")nama@ {
        if (it==""){
            return@nama
        }else{
            println("Hildan")
        }
    }
}
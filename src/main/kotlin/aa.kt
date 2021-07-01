fun ujiann(ai:Int=0,dm:Int=0,jarkom:Int=0){

    var rata2=ai+dm+jarkom/3
    if (rata2 in 70..100){
        println("Nilai A")
    }
    else if (rata2 in 50..69)
        println("Nilai B")
    else if (rata2 in 30..49)
        println("Nilai C")
    else {
        println("Nilai D")

    }

}
fun pahlawan(naga:Int,peluru:Int){
    if(peluru/2 >= naga){
        println("hidup")
    }
    else{
        println("mati")
    }
}
fun main() {
    ujiann(80,90)
    pahlawan(2,4)
}
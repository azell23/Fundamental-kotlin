fun kanan(x:Int){

    var a=x
    while(a>=1){
        var y=x
        while (y>a){
            print(" ")
            y--
        }
        var z=1
        while (z<a*2){
            print("*")
            z++
        }
        println()
        a--
    }
}
fun aritmatika(awal:Int,akhir:Int,beda:Int):Int{
    var jml=0
    for(i in awal..akhir step beda){
        print("$i ")
        jml+=i
    }
    return jml
}
fun main() {
    kanan(8)
    println(aritmatika(1,10,1))
}


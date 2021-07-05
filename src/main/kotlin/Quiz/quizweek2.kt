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
fun aritmatika(awal:Int,akhir:Int,beda:Int){
    for(i in awal..akhir step beda){
        print("$i+")

    }
    var n=akhir/beda
    var jml=n/2*(2*awal+(n-1)*beda)
    print(" = $jml")

}
fun main() {
    kanan(8)
}


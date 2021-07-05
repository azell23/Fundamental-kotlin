fun kanan(){
    var x=3
    while(x>=1){
        var y=3
        var z=1
        while (y>x){
            print(" ")
            y--
        }

        while (z<x*2){
            print(z)
            z++
        }
        println()
        x--
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
    kanan()
    aritmatika(1,10,2)
}


fun main() {
    var a = 0
    while (a < 15){
        println("perulangan $a")
        a++
        if (a == 10){
            break
        }
    }
    for (i in 1..15){
        if (i ==10){
            continue
        }
        println(i)
    }

}
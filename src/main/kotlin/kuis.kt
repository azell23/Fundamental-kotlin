fun ujian(ai:Int=70,dm:Int=70,jarkom:Int=80) {
    if (ai > 70) {
        println("Nilai AI= A")
    } else if (ai > 50)
        println("Nilai AI= B")
    else if (ai > 30)
        println("Nilai AI= C")
    else {
        println("Nilai AI= D")
    }
    if (dm > 70) {
        println("Nilai Data Mining = A")
    } else if (dm > 50)
        println("Nilai Data Mining = B")
    else if (dm > 30)
        println("Nilai Data Mining = C")
    else {
        println("Nilai Data Mining = D")

    }
    if (jarkom > 70) {
        println("Nilai Data Mining = A")
    } else if (jarkom > 50)
        println("Nilai Data Mining = B")
    else if (jarkom > 30)
        println("Nilai Data Mining = C")
    else {
        println("Nilai Data Mining = D")

    }

}

fun main() {
    ujian(ai = 60,dm = 20,jarkom = 30)
}
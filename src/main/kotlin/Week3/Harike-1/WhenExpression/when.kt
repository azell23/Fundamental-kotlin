package Week3.`Harike-1`.WhenExpression

fun main() {
    val nilai = 'A'
    val nilai2 =80
    val lulus= arrayOf('A','B','C')
    when (nilai) {
        'A' -> println("amazing")
        'B' -> println("good")
        'C' -> println("not bad")
        else -> println("try again")
    }
    when (nilai) {
        'A', 'B', 'C' -> println("good")
        else -> println("Try")

    }
    when (nilai) {
        in lulus -> println("lulus")
        !in lulus -> println("Gagal")
    }
    when (nilai) {
        is Char -> println("Nilai bertipe data char")
        !is Char -> println("Nilai tidak bertipe data char")
    }
    when{
        nilai2 >90 -> println("Bagus")
        nilai2 >75 -> println("Belajar lagi")
        else -> println("Remidi")
    }
}
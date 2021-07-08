package Week4.`harike-4`.LambdaExpression

fun sum (a:Int, b:Int):Int {
    var c=a+b
    return c
}
fun main() {
    val nama:(String) -> String={ value: String -> //variabel nama dengan tipe data string,kembaliannya String, berisi parameter value bertipe data string
        value.toUpperCase() //nilai value akan diubah menjadi huruf kapital

    }
    println(nama("Hildan"))
    val namait:(String)->String={
        it.toUpperCase()
    }
    println(namait("rizky"))
    val hitung: (Int, Int) -> Int =::sum
    println(hitung(1,2))
}
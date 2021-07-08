## Lambda Expression
Secara sederhana lambda expression adalah function yang tidak memiliki nama.Dengan lambda expression kita bisa membuat function tanpa harus mendeskrispsikan nama functionnya.
Saat membuat lambda expression tidak memerlukan kata kunci fun,kita bisa membuatnya di dalam variable.
```
fun LambdaExpression.main() {
    val nama:(String) -> String={ value: String -> 
        value.toUpperCase() 

    }
    println(nama("Hildan"))
}
```
### Kode : it
Digunakan jika lambda expression hanya menggunakan satu parameter,it disini mewakili parameter yang tidak ditambahkan di lambda tersebut,it dapat berjalan jika lambda expression hanya memiliki satu parameter saja.

```
    val namait:(String)->String={
        it.toUpperCase()
    }
    println(namait("rizky"))
}
```
### Method References
Membuat lambda dengan output menggunakan function yang telah dibuat,untuk melakukan method ini dapat menggunakan :: pada body lambda.
```
fun LambdaExpression.sum (a:Int,b:Int):Int {
    var c=a+b
    return c
}
fun LambdaExpression.main() {
    val hitung: (Int, Int) -> Int =::LambdaExpression.sum 
    println(hitung(1,2))
}
```
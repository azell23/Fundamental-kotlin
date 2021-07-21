fun haii(nama:String,ubah:(String)->String):String{
    val name=ubah(nama)
    return " $name"
}
fun main() {
    val upper = fun(value:String):String{
        if (value.isBlank()){
            return "nama kosong"
        }else {
            return value.toUpperCase()
        }
    }
    println(haii("Katsumaru",upper))
    println(haii("",upper))
    println(haii("KATSUMARU",fun(value:String):String{
        return value.toLowerCase()
    }))
}

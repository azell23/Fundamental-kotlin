package Week3.`Harike-2`.Function

fun nama() { //function
    println("Mail")
    println(1+1)
}
fun nilai(nilai1: Int, nilai2: Int){ //function parameter
    println("UTS $nilai1 UAS $nilai2")
}
fun name(firstname: String, lastname: String ="I") { //function default argument
    println("$firstname $lastname")
}
fun angka(angka1: Int = 12, //function named argument
          angka2: Int,
          angka3: Int,
          angka4: Int,
          angka5: Int,){
    println("Function.angka ke 1 = $angka1 " +
            "Function.angka ke 2 = $angka2 " +
            "Function.angka ke 3 = $angka3 " +
            "Function.angka ke 4 = $angka4 " +
            "Function.angka ke 5 = $angka5 ")
}
fun bagi(a:String, b:Int):String { //function return
    if (b<=10){
        return "bocil"
    }else{
        val c="Function.nama = $a umur = $b "
        return c
    }
}
fun single(a:String,b:Int)= println("NAMA = $a umur = $b ")
fun array(vararg angka:Int):Int{
    var a=0
    for (i in angka){
        a+=i
    }
    return a
}
fun String.helo(): String = "Hello $this"
infix fun String.to(type:String):String{
    return if(type == "UP"){
       this.toUpperCase()
    } else{
         this.toLowerCase()
    }

}
fun main() {
//    Function.nama()
//    Function.nilai(80,85)
//    Function.name("mail")
//    Function.name("mail", "Ismail")
//    Function.angka(angka2 = 20,angka3 = 30,angka5 = 50,angka4 = 40)
//    println(Function.bagi("mail",0))
//    println(Function.bagi("ismail",12))
//    Function.single("mail",15)
//    println(Function.array(10,10,10,10))
//    val Function.name ="Hildan"
//    println("ihal".Function.helo())
//    val name1 ="Rizky" to "UP"
//    println(name1)
//    fun namaa(Function.name:String){
//        println("Nama $Function.name")
//    }
//    namaa("Ramadhan")
    println("ijal".helo())
}
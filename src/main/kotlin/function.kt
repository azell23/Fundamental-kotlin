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
    println("angka ke 1 = $angka1 " +
            "angka ke 2 = $angka2 " +
            "angka ke 3 = $angka3 " +
            "angka ke 4 = $angka4 " +
            "angka ke 5 = $angka5 ")
}
fun bagi(a:String, b:Int):String { //function return
    if (b<=10){
        return "bocil"
    }else{
        val c="nama = $a umur = $b "
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
//    nama()
//    nilai(80,85)
//    name("mail")
//    name("mail", "Ismail")
//    angka(angka2 = 20,angka3 = 30,angka5 = 50,angka4 = 40)
//    println(bagi("mail",0))
//    println(bagi("ismail",12))
//    single("mail",15)
//    println(array(10,10,10,10))
//    val name ="Hildan"
//    println("ihal".helo())
//    val name1 ="Rizky" to "UP"
//    println(name1)
//    fun namaa(name:String){
//        println("Nama $name")
//    }
//    namaa("Ramadhan")
    println("ijal".helo())
}
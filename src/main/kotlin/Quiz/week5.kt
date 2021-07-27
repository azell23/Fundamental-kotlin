fun reduplikasi(kata:String):Unit{
    var value=kata.split("-")
        if (value[0]==value[1]){
            println("Kata reduplikasi")
        }else{
            println("bukan kata reduplikasi")
        }

}
fun palindrome(kata: String):Unit {
    if (kata==kata.reversed()){
        println("Kata palindrome")
    }else{
        println("Bukan kata palindrome")
    }
}
fun halaman(angka: Int):Unit{
    if (angka%4==0 || angka%5==0){
        println("favorite pages")
    }
    else if(angka%5==0){
        println("pages")
    }
    else if (angka %4==0){
        println("Favorite")
    }

}
fun pengarang(nama: String):Unit {
    var value=nama.toLowerCase()
    for(namaa in value){
    }
    println(value.capitalize())

}
fun main() {
    reduplikasi("layang-layang")
    palindrome("level")
    halaman(4)
    pengarang("wIlLiam sHacKeSpeare")


}
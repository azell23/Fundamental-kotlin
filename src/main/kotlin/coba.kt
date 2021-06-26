const val APP="belajar kotlin"
fun main() {
    var firstname:String ="Hildan"
    var lastname:String ="Rizky"
    var address:String="""
    Street m.toha
    Provinsi jawa tengah
    Indonesia
    """
    var address2:String="""
    |Street m.toha,
    |Provinsi jawa tengah,
    |Indonesia,
    """.trimMargin()
    var address3:String="""
    Street m.toha
    Provinsi jawa tengah
    Indonesia
    """.trimIndent()
    var fullname:String=firstname+" "+lastname
    var template:String="$firstname $lastname"
    var nama:String?= "hildan"
        nama = null
    firstname="ismail"
    val a="mail ismail"

    println(a.reversed())
    println(a)


    println(firstname)
    println(lastname)
    println(address)
    println(address2)
    println(address3)
    println(fullname)
    println(template)
    println(nama?.length)
    println("Welcome to $APP")
}
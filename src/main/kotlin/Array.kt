fun main() {
    val members:Array<String> = arrayOf("hil","dan","Riz")
    val angka:Array<Byte> = arrayOf(1,2,3)
    val name:Array<String?> = arrayOfNulls(5)
    name.set(0,"hil")
    name.set(1,null)
    name.set(2,"dan")
    println(members[0])
    println(name[1])
}
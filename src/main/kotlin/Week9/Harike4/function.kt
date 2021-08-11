package Week9.Harike4

class function(var nama:String) {
    override fun toString(): String {
        return "User with name $nama"
    }

    override fun equals(other: Any?): Boolean {
        return when (other){
            is function -> other.nama ==this.nama
            else -> false
        }
    }

    override fun hashCode(): Int {
        return nama.hashCode()
    }
}

fun main() {
    var hil=function("Katsumaru")
    var dan=function("Katsumar")
    println(hil.toString())
    println(hil.equals("Katsumaru")==dan.equals("Katsumaru"))
    println(hil.hashCode()==dan.hashCode())

}
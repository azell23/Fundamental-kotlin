package Week11.Harike3
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class coba(val author: String)

@coba(author = "Plugin")
class  cobaan( val name:String ,val version:Int){
    fun info()="Aplikasi $name-$version"
}
@Target(AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD,
    AnnotationTarget.VALUE_PARAMETER
)
annotation class target
class terget(@field:target val first:String,
             @get:target val mid:String,
             @param:target val last:String
            )


fun main() {
    val hil=cobaan("Bola",2000)
    println(hil.info())
}
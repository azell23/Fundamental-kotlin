package Week11.Harike3
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class notblank

data class identitas(@notblank val id:String,
                     @notblank val name:String,
                     @notblank val harga:Int
)

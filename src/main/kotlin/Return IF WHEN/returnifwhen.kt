package `Return IF WHEN`

fun hai(name:String=" "):String{
    if(name==" " ){
        return "Hello bro"
    }else{
        return "Hello $name"
    }
}
fun hai1(name:String=" "):String{
    return if(name==" " ){
         "Hello bro"
    }else{
         "Hello $name"
    }
}

fun main() {
    println(hai())
    println (hai("mael"))
    println (hai1())
    println (hai1("mael"))
}
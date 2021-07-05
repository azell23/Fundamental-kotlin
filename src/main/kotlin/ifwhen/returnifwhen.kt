fun hai1(name:String=" "):String{
    return if(name==" " ){
        "Hello bro"
    }else{
        "Hello $name"
    }
}
fun hai(name:String=" "):String{
    return when(name){
        " "->"mael"
        else ->"hello $name"

    }
}

fun main() {
    println(hai())
    println (hai("mael"))
    println (hai1())
    println (hai1("mael"))
}
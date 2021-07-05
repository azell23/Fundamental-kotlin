##Return IF When
mengembalikan nilai di dalam blok If atau When
```
fun `Return IF WHEN`.hai(name:String=" "):String{
    if(name==" " ){
        return "Hello bro"
    }else{
        return "Hello $name"
    }
}

fun `Return IF WHEN`.main() {
    println(`Return IF WHEN`.hai())
    println (`Return IF WHEN`.hai("mael"))
}
```
```
fun `Return IF WHEN`.hai1(name:String=" "):String{
    return if(name==" " ){
         "Hello bro"
    }else{
         "Hello $name"
    }
}

fun `Return IF WHEN`.main() {
    println (`Return IF WHEN`.hai1())
    println (`Return IF WHEN`.hai1("mael"))
}
```
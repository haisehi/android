fun sayHello(name:String){
    println("Hello ${name}")
}
//function which returns value
fun sum(x:Double,y:Double):Double{
    return x+y
}
fun showColor(red:Int,green:Int,blue:Int,alpha:Float){
    println("Color: $red-$green-$blue-$alpha")
}
//function with Variadic Arguments - varang
fun like(vararg fruits:String){
    for (fruit in fruits){
        println("I like $fruit")
    }
}
//infix function
//can be called without using the period and brackets
infix fun Int.plus(x:Int):Int{
    return this + x
}
infix fun Int.times(x:Int):Int=this*x
infix fun String.loves(name:String)="$this love $name"
//higher order function is
//function that takes another function as parameter
//or function returns a function
fun doSomething(x:Int,y:Int,completion:(Int)->Unit){
    println("do something")
    val result =x+y
    completion(result)
}
//function returns a function
fun operation(x:Float):(y:Float)->Float{
    return fun(y:Float):Float{
        return y * y
    }
}
//lamda function
val getFullNam: (String, String) -> String ={
    firstName:String, lastName:String -> run{
        println("This is a lamda function")
        "$firstName $lastName"
}
}
//another example
val url:(Int,Int)->String={
    page:Int,limit:Int ->
    "http://yourServer/product?page=$page&?limt=$limit"
}


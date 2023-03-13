
fun main() {
    println("Hello World!")
    var x = 5 //this is a variable
    var a:Int =120
    println("x is :${x} , a =${a}")
    //you can change value of a variable
    x = 6 ;
    println("Now x is ${x}")
    //val cannot be re-assigned
    val y = 7;
//   y = 55
    //function = a block of code
    sayHello("Huy")
    println("sum 2 value x and y is ${sum(4.1,6.6)}")
    showColor(255,0,0, 0.5f)
    like("apple","pineaple","orange","watermelon","passion","strawberry")
    val z =5 plus 5
    println("z + 5=  ${z}")
    println("z + 3 =  ${5 plus 3}")
    println("6 times 5 = ${6 times  5}")
    println("John" loves "Mary")
    var message:String ="John" loves "Mary"
    println(message)
    var email:String? //nullable
    email=null
    println("email=$email")
    println("email=${email ?:"wanhi0101@gmail.com"}") //default value
    println("email's lenght is=${email?.length}")
//    doSomething(1,2, completion = {result:Int -> run {
//        println("result is: $result")
//    }})
    println("operation =${operation(x=10.0f)(20.0f)}")
    println("Full name :${getFullNam("Phan Quang","Huy")}")
    println(url(0,100))
    url(0,100).let {
        println("It means that url is NOT NULL")
        println(it)
    }
    //class in kotlin
    //define an object from class
    val user1=User(1,"Quang Huy","wanhi0101@gmail.com")
    val user2=User(1,"Quang Huy","wanhi0101@gmail.com")
    //2 data object with the same value =>the same hashcode
    println(user1)
    println(user1.hashCode())
    println(user2)
    println(user2.hashCode())
    if(user1.equals(user2)){
        println("user1 and user2 has the same content")
    }else{
        println("user1 and user2 has not the same content")
    }
    user1.name="john"
    println(user1)
    val user3=User(2,"Huyn","huyn1@gmail.com")
    //copy object
    //val user4 =user3.copy()
    //clone and changes properties
    val user4=user3.copy(email = "soohee123@gmail.com")
    println(user3)
    println(user4)
    //enum class
    val quality:Quality=Quality.GOOD
    val qualityMessage:String=when(quality){
        //when =switch-case
        Quality.BAD->"this is bad"
        Quality.GOOD->"this is good"
        Quality.NORMAL->"this is normal"
        Quality.EXCELLENT->"this is excellent"
    }
    println(qualityMessage)
    val requestError:RequestError=RequestError.INTERNAL_ERROR
    println(requestError)
    println(requestError.message)
    println(requestError.wordCount())
//    define a key-value object

}
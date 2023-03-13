fun main() {
    var a=10
    var b=0
    try {
        var c=a/b
        println(c)
    }catch (e:Exception){
            e.printStackTrace()
    }finally {
        println("doan code phia sau")
    }

}
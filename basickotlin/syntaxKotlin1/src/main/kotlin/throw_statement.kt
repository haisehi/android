fun thuong(a:Int,b:Int):Int{
    if (b==0)
        throw Exception("khong the chia cho 0")
    return a/b
}
fun main() {
    try {
        thuong(5, 0)
    }catch (e:Exception){
        println(e.message)
    }finally {
        println("doan code phia sau van hoat dong")
    }
}
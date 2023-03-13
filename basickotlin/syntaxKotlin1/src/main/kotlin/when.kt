fun main() {
//    //1.when
//    var i:Int?= readln().toInt()
//    when(i){
//        1 -> println("Ban da chon so 1")
//        2 -> println("ban da chon so 2")
//        3 -> println("ban da chon so 3")
//        else -> println("ban da chon so $i")
//    }
//    //2.kiem tra tinh chan le
//    var a:Int=0
//    println("Nhap vao mot so nguyen")
//    var s:String= readln()
//    if(s!=null)
//        a=s.toInt()
//    //kiem tra cau truc when
//    when(a%2){
//        0 -> println("$a la so chan")
//        else -> println("$a khong phai so chan")
//    }
//    //3.when 1 nhom dieu kien
//    var thang:Int=0
//    println("nhap vao mot thang")
//    var s:String= readln()
//    if (s!=null)
//        thang=s.toInt()
//    when(thang){
//        1,2,3 -> println("thang $thang thuoc quy 1")
//        4,5,6 -> println("thang $thang thuoc quy 2")
//        7,8,9 -> println("thang $thang thuoc quy 3")
//        10,11,12 -> println("thang $thang thuoc quy 4")
//    }
//    //4.kiem tra vung du lieu bang when
//    var i:Int=0
//    println("Nhap vao mot chuoi so")
//    var s:String= readln()
//    if (s!=null)
//        i=s.toInt()
//    when(i){
//        in 1..10-> println("$i nam trong khoang 1 den 10")
//        in 10..100-> println("$i nam trong khoang 10 den 100")
//        in 100..1000-> println("$i nam trong khoang 100 den 1000")
//        else -> println("$i nam trong khoan lon hon 1000")
//    }
    //5.bieu thuc tra ve when+when(if-else)
    var i:Int=101
    var check = when(i){
        in 1..100 -> println("false")
        else -> println("true")
    }
    var a:Int=55
    when{
        a%2==0-> println("so chan")
        else-> println("so le")
    }
}
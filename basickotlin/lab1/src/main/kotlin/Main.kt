import java.util.Scanner;
//bai2
fun main(args: Array<String>) {
    val intput = Scanner(System.`in`);
    println("Nhap so phan tu trong")
    var num:Int= intput.nextInt();
//    println(num)
    var s = 0;
    var s2 = 0;

//    for (i in 0..num){
////        println(i)
//        if(i%3==0){
//            println(i)
//            s=s+i;
//        }
//    }
//    println("tong cac so chia het cho 3 la :$s")
//    while
    while (num >=0){
        if (num%3==0){
            s2=s2+num;
        }
        num--
    }
    println(s2)
}
import java.util.Scanner;
fun main(args: Array<String>) {
    val intput = Scanner(System.`in`);
    println("Nhap 2 so nguyen")
    var num1:Int= intput.nextInt();
    var num2:Int= intput.nextInt();
    var s1 = num1 + num2 ;
    var s2 = num1 - num2 ;
    var s3 = num1 * num2 ;
    var s4 = num1 % num2 ;
    println("tong 2 so : $s1");
    println("hieu 2 so : $s2");
    println("tich 2 so : $s3");
    if (s4 ==0){
        println("thuong 2 so : 0");
    }else{
        println("thuong 2 so : $s4");
    }


}
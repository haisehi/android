import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    println("Bai 1:");
    println("nhan so thu nhat");
    var num1:Int = input.nextInt();
    println("nhap so thu hai");
    var num2:Int = input.nextInt();
    println("cong :"+cong(num1,num2));
    println("tru :"+tru(num1,num2));
    println("nhan :"+nhan(num1,num2));
    println("chia :"+chia(num1,num2));
    println("Bai 2:");
    println("Nhap diem mon hoc thu nhat");
    var point1:Int=input.nextInt();
    println("Nhap diem mon hoc thu hai");
    var point2:Int=input.nextInt();
    println("Nhap diem mon hoc thu ba");
    var point3:Int=input.nextInt();
    println("Tong diem cua 3 mon la "+TongDiem(point1,point2,point3));
    println("Diem trung binh cua 3 mon la "+avg(point1,point2,point3));
    println("Xep loai:");
    if (avg(point1,point2,point3)>=8.5&&avg(point1,point2,point3)<=10){
        println("Gioi")
    }else if (avg(point1,point2,point3)>=8&&avg(point1,point2,point3)<=8.4){
        println("kha gioi");
    }else if (avg(point1,point2,point3)>=7&&avg(point1,point2,point3)<=7.9){
        println("kha");
    }else if (avg(point1,point2,point3)>=6.5&&avg(point1,point2,point3)<=6.9){
        println("trung binh kha");
    }else if (avg(point1,point2,point3)>=5.5&&avg(point1,point2,point3)<=6.4){
        println("trung binh");
    }else if (avg(point1,point2,point3)>=5&&avg(point1,point2,point3)<=5.4){
        println("trung binh yeu");
    }

}
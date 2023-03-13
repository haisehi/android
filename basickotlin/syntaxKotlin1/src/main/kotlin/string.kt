import java.lang.StringBuilder

fun main(array: Array<String>) {
    var a:String="chuoi thu nhat "
    var b="chuoi thu hai"
    //kiem tra loai du lieu
    println(a::class.java.typeName)
    println(b::class.java.typeName)
    //kiem tra do dai chuoi
    println("độ dài của chuỗi thứ nhất là :"+a.length)
    println("độ dài của chuỗi thứ hai là :"+b.length)
    //so sanh 2 chuoi
    println("Noi 2 chuoi a va b "+a.compareTo(b))
    //lay vi tri dau tien cua ki tu
    var c="abccdeee"
    println(c.indexOf("c"))
    //lay vi tri cuoi cung cua ki tu
    println(c.lastIndexOf("c"))
    //kiem tra chuoi e co chua chuoi d khong
    var d=".mp3"
    var e="tuhoc.mp3"
    var check:Boolean=e.contains(d)
    if (check){
        println("e co chua d")
    }else{
        println("e khong co chua d")
    }
    //hien thi chuoi theo do dai da cho cho
    var f="tu hoc lap trinh tren mang"
    var g=f.substring(2)
    var h=f.substring(2,6)
    println(f)
    println(g)
    println(h)
    //thay the chuoi
    var i="HOC NUA hoc mai"
    var j=i.replace("hoc","MAI")
    println(j)
    var k=i.replace("hoc","Mai",ignoreCase = true)
    println(k)
    //xoa khoang trang o dau va cuoi
    var r="    dang tu hoc lap trinh tren youtube   "
    var l=r.trim()
    var n=r.trimStart()
    var m=r.trimEnd()
    println(r)
    println(l)
    println(n)
    println(m)
    //cong 2 chuoi
    var o ="hom nay troi mua "
    var p =o+"nen toi nghi hoc"
    println(p)
    println(o.plus("nen toi nghi hoc"))
    //noi chuoi
    var t = StringBuilder("o la la ")
    //chen
    t.insert(2,"da chen ")
    println("chuoi duoc chen: ${t}")
    //them noi duoi
    t.append("da them noi duoi")
    println("chuoi da them noi doi: ${t}")
    //dao nguoc chuoi
    t.reverse()
    println("chuoi duoc dao nguoc :${t}")
    //xoa chuoi
    t.delete(1,3)
    println("chuoi da duoc xoa: ${t}")
    //tach chuoi tra ve list
    var s="tachchuoitrave.list"
    var arr:List<String> = s.split(".")
    for (i in arr){
        println(i)
    }
}
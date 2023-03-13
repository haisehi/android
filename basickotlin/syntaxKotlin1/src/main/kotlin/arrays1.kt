import kotlin.random.Random

fun main(array: Array<String>){
//    //khai bao mang
//    var m:IntArray= IntArray(5)
//    var n:FloatArray= FloatArray(3)
//    println(m::class.java.typeName)
//    println(n::class.java.typeName)
//    for (i in m){
//        print("$i\t")
//    }
    //khoi tao va gan gia tri cho mang
    var m:IntArray= intArrayOf(0,1,2,3,4,5,6,7,8)
    for (i in m)
    {
        print("$i\t")
    }
    println("size m : "+m.size)
    //try suat qua index
    println(m[0])
    println(m[3])
    //thay doi mang
    m[1]=100
    m[2]=44
    println("mang sau khi duoc thay doi la:")
    for (i in m)
    {
        print("$i\t")
    }
    println("\n")
    //khoi tao mot mang ngau nhien
    var rd = Random
    var m2:IntArray= IntArray(6)
    println(m2.indices)
    for (i in m2.indices){
        m2[i]= rd.nextInt(101)
    }
    //xuat mang ngau nhien
    println("Mang ngau nhien cua M7 la")
    for (i in m2){
        print("$i\t")
    }
    //ghep mang
    var m3= arrayOf(1,2,3,4,5)
    println(m3.indices)
    var m4=m3
    m3[0]=113
    println(m3[0])
    println(m4[0])
    //tao ra mang moi tren vung nho moi
    var m5 = arrayOf(2,5,8,9)
    var m6 = m5.clone()
    m5[0]=99
    println(m5[0])
    println(m6[0])
    //dao nguoc mang
    m5.reverse()
    println("mang sau khi dao nguoc la")
    for (i in m5){
        print("$i\t")
    }
    //sap xep tang dan
    var m7= arrayOf(0,2,5,9,4,6)
    m7.sort()
    println("\n mang sau khi sap xep la")
    for (i in m7){
        print("$i\t")
    }
    //filter
    var m8= arrayOf(1,3,5,7,8,10,22)
    var ds =m8.filter { i ->i%2==0  }
    var ds2 =m8.filter { i ->i%2!=0  }
    println("\n"+ds)
    println("\n"+ds2)
}
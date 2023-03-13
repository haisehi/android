import kotlin.random.Random

fun main(args: Array<String>) {
    //mang 2 chieu 3 hang , 4 cot
    var m1:Array<IntArray> = Array(3,{ IntArray(4) })
    //mang 2 chieu 5 hang , 4 cot
    var m2:Array<IntArray> = Array(5,{IntArray(7)})
    //tao mang ngau nhien
    var rd = Random
    println(m1.indices)
    //i so hang , j so cot
    for (i in m1.indices){
        for (j in m1[i].indices){
//            print("$i$j\t")
            m1[i][j]=rd.nextInt(51)
        }
        println()
    }
    //xuat mot phan tu
    println(m1[0][0])
    println(m1[0][1])
    println(m1[0][2])
    println(m1[0][3])
    //xuat mang
    for (i in m1.indices){
        for (j in m1[i].indices){
            print("${m1[i][j]}\t")
        }
        println()
    }
}
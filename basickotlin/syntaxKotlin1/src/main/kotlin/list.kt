fun main(args: Array<String>) {
    //khai bao MutableList co the thay doi
    var ds1:MutableList<Int> = mutableListOf(0,2,3,5,7,8)
    //khai bao list thong thuong
    var ds2:List<Int> = listOf(0,3,4,6,2,1)
    println("mutable list : ${ds1}")
    println("list : ${ds2}")
    //duyet list
    println(ds1.indices)
    for (i in ds1.indices){
        print("${ds1[i]}\t")
    }
    println()
    //tra ve so phan tu trong list
    println("so phan tu trong danh sach 1: ${ds1.size}")
    println("so phan tu trong danh sach 2: ${ds2.size}")
    //them mot phan tu
    ds1.add(6)
    println("mang sau khi them mot phan tu: ${ds1}")
    //them nhieu phan tu
    ds1.addAll(mutableListOf(4,10,17,15))
    println("mang sau khi them nhieu phan tu: ${ds1}")
    //xoa phan tu
    ds1.removeAt(1)
    println("mang sau phi xoa: ${ds1}")
    //sap xep tang dan
    ds1.sort()
    println("mang sau khi duoc sap xep tang dan: ${ds1}")
    //sap xep mang giam dan
    ds1.sortDescending()
    println("mang sau khi duoc sap xep giam dan: ${ds1}")
    //filter
    var ds3=ds1.filter { x->x>10 }
    println("filter ${ds3}")
    //contains
    println(ds1.contains(7))
}
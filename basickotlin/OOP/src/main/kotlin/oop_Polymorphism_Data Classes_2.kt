fun main(args: Array<String>) {
    //polymophism
    var dt1:tinhToan=TinhCong()
    dt1.Tinh(5,6)
    dt1=TinhHieu()
    dt1.Tinh(7,5)

    //data class
    data class TestData(var ten:String,var cccd:String)
    var data1 = TestData("Lap trinh buoi toi","00092345")
    //phuong thuc copy
    var data2 =data1.copy("khong thich lap trinh")
    println(data1)
    println(data2)
    //componentN
    println(data2.component1())
}
fun main(){
    //1.tao 1 doi tuong primary constructor
    var sv1 = sinhVien(2618,"Quang huy","206393477")
    //.tao 1 doi tuong secondary constructor
    var sp1 = sanPham()
    var sp2 = sanPham(2618,"Chocolate","01/01/2023 - 01/01/2024")
    //test lop sv 2
    var sv2=lopSV2()
    var sv3=lopSV2(1,"Hi")
    println("tt sv2 la ${sv2.ma}-${sv2.ten}")
    println("tt sv3 la ${sv3.ma}-${sv3.ten}")
    sv2.DiemToan=9.5f
    println("diem toan sv 2 :${sv2.DiemToan}")
    sv2.DiemVan=5.6f
    sv2.xuatTTSV()
    println("Diem trung binh 2 mon toan va van la :${sv2.tdtb(sv2.DiemToan,sv2.DiemVan)}")
    println(sv2)
    var nx1=Tuoi(2005)
    nx1.kiemtra()
    println("-------------------------")
    var test1 = thamChieuThis()
    test1.diemVan=8.5f
    test1.diemToan=9.0f
    test1.testBienCucBo(7f,6f)
    println("diem toan cua test1 sau khi goi ham TestCucBo "+test1.diemToan)
    println("diem van cua test1 sau khi goi ham TestCucBo "+test1.diemVan)
    println("-------------------------")
    var sanPham1 = overloading(20012,"Tivi",4.000000)
    var sanPham2 = overloading(20012,"Tivi")
    var gia1 = sanPham1.chietKhau()
    var gia2 = sanPham1.chietKhau(true)
    println("gia 1: $gia1")
    println("gia 2: $gia2")
    println("-------------------------")
    var dt1=Parameters()
    var kg1=dt1.TinhTong(10,20,33,1,5,8,9,4)
    println(kg1)
}
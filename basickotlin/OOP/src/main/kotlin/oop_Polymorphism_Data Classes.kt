fun main(args: Array<String>) {
    var nv1:nhanSu=PhoPhong()
    println("luong cua pho phong la: ${nv1.TinhLuong(20)}")
    nv1 = TruongPhong()
    println("luong cua truong phong la: ${nv1.TinhLuong(20)}")
}
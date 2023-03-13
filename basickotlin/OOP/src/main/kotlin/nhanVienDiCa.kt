class nhanVienDiCa:nhanvien {
    constructor(ten:String,cccd:String,que:String):super(ten,cccd,que)
    constructor(ten:String,cccd:String):super(ten,cccd)
    override fun TinhLuong(): Double {
        return luongCoBan*1.05
    }
}
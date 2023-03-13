class thamChieuThis {
    //instance variable
    var diemVan:Float=0.0f
    var diemToan:Float=0.0f

    fun testBienCucBo(diemVan:Float,diemToan:Float){
        println("Tong diem bien cuc bo: "+(diemVan+diemToan))
        println("Tong diem bien instance variable: "+(this.diemVan+this.diemToan))
        this.diemToan=diemToan
        this.diemVan=diemVan
    }
}
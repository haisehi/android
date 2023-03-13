class overloading {
    //private var
    private var maSP:Int=0
    private var tenSP:String=""
    private var giaSP:Double=0.0
    constructor(maSP:Int,tenSP:String,giaSP:Double) //3 doi so
    {
        this.maSP=maSP
        this.tenSP=tenSP
        this.giaSP=giaSP
    }
    constructor(maSP:Int,tenSP:String) //2 doi so
    {
        this.maSP=maSP
        this.tenSP=tenSP
    }
    fun chietKhau():Double{
        return this.giaSP*0.95 //giam 5%
    }
    //ham viet cho ngay sinh nhat cua khach hanh
    fun chietKhau(sinhNhat:Boolean):Double{
        if (sinhNhat){
            return this.giaSP*0.90 //giam 10%

        }else{
            return this.giaSP*0.95 //giam 5%
        }
    }
}
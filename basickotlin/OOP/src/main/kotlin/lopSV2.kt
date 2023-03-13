import java.lang.foreign.ValueLayout.OfFloat

class lopSV2 {
    var ma:Int=0
    var ten:String=""
    private var diemtoan: Float = 0.0f

    //kahi bao properties
    var DiemToan:Float
        get() = diemtoan
        set(value) {
            diemtoan = value
        }
    //khai bao diem van
    private var diemVan: Float = 0.0f

    //kahi bao properties
    var DiemVan:Float
        get() = diemVan
        set(value) {
            diemVan = value
        }

    constructor(){
        ma=0
        ten="No name"
    }
    constructor(m:Int,t:String){
        ma=m
        ten=t
    }
    //1.ham tinh diem trung binh
    fun tdtb(diemtoan:Float,diemVan:Float):Float{
        return (diemtoan+diemVan)/2
    }
    //3.xuat thong tin
    fun xuatTTSV(){
        println("thong tin sinh vien ")
        println("ten : ${ten}")
        println("ma sinh vien : ${ma}")
        println("diem toan : ${diemtoan}")
        println("diem van : ${diemVan}")
    }
    //4.toString()
    override fun toString(): String {
        return "Ma sinh vien: $ma - ten sinh vien: $ten"
    }
}
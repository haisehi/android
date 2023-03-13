class Tuoi {
    //khai bao bien nam sinh
    private var namSinh: Int = 0
    //khai bao pro
    var NamSinh:Int
    //khai bao get-set
        get() = namSinh
        set(value) {
            namSinh = value
        }
    //khai bao constructor
    constructor(y:Int){
        namSinh=y
    }
    //support method
    private fun checkTuoi():Boolean{
        var tuoi = 2022 - namSinh
        return tuoi>=18
    }
    //service method
    fun kiemtra(){
        if (checkTuoi()){
            println("Du tuoi xem phim")
        }else{
            println("khong du tuoi xem phim")
        }
    }
}
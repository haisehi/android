class Parameters {
    fun TinhTong(vararg dsSo:Int):Int{
        var Tong =0
        for (so in dsSo){
            Tong+=so
        }
        return Tong
    }
}
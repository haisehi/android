data class User(val id:Int,var name:String,var email:String ) {
//    you can also with properties determine "equal
    override fun equals(other: Any?): Boolean {
        return other is User
                && this.id==other.id
                && this.name==other.name
                && this.email==other.email
    }
    //you can also rewrite the hashcode method
    override fun hashCode(): Int {
        return id+name.hashCode()+email.hashCode()
    }
}
package com.example.sqlite

class course(courseName:String?,courseDecription:String?,courseDuration:String?) {
    private var id=0;
    private var courseName:String?=courseName
    private var courseDecription:String?=courseDecription
    private var courseDuration:String?=courseDuration
    fun getID():Int{
        return id
    }
    fun setID(id:Int){
        this.id
    }
    fun getCourseName():String?{
        return courseName
    }
    fun setCourseName(courseName: String?){
        this.courseName
    }
    fun getDecription():String?{
        return courseDecription
    }
    fun setDecription(courseDecription: String?){
        this.courseDecription
    }
    fun getCourseDuration():String?{
        return courseDuration
    }
    fun setCourseDuration(courseDuration: String?){
        this.courseDuration
    }

}
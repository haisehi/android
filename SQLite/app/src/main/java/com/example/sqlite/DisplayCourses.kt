package com.example.sqlite

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DisplayCourses:AppCompatActivity() {
    lateinit var db:DBHelper
    lateinit var adapter: ItemAdapter
    lateinit var rvCourses:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_courses)
        db = DBHelper(this,null)
        var courseArrayList:ArrayList<course>
        courseArrayList=db!!.readCourse()!!
        rvCourses=findViewById(R.id.rvCourseList)
        val linnearLayoutManager=LinearLayoutManager(this@DisplayCourses,RecyclerView.VERTICAL,false)
        rvCourses.setLayoutManager(linnearLayoutManager)
        rvCourses.adapter=ItemAdapter(this@DisplayCourses,courseArrayList)
    }
}
package com.example.sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtCourseName:EditText
    lateinit var edtCourseDecription:EditText
    lateinit var edtCourseDuration:EditText
    lateinit var btnAddCourse:Button
    lateinit var btnReadCourse:Button
    //database
    lateinit var db:DBHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtCourseName=findViewById(R.id.editTextCourseName)
        edtCourseDecription=findViewById(R.id.editTextDecription)
        edtCourseDuration=findViewById(R.id.editTextDuration)
        btnAddCourse=findViewById(R.id.btnAddCourses)
        btnReadCourse=findViewById(R.id.btnReadCourses)
        db= DBHelper(this,null)
        btnAddCourse!!.setOnClickListener{
            addNewCourse()
        }
        btnReadCourse!!.setOnClickListener {
            val intent=Intent(this@MainActivity,DisplayCourses::class.java)
            startActivity(intent)
        }
    }
    private fun addNewCourse(){
        var courseName:String=edtCourseName.text.toString()
        val courseDescription:String=edtCourseDecription.text.toString()
        val courseDuration:String=edtCourseDuration.text.toString()
        if(courseName.isEmpty() && courseDescription.isEmpty() && courseDuration.isEmpty()){
            Toast.makeText(this@MainActivity,"Please enter all the data...",Toast.LENGTH_SHORT).show()
        }else{
            db!!.addNewCourse(
                courseName,
                courseDescription,
                courseDuration
            )
        }
        Toast.makeText(this@MainActivity,"Course has been added",Toast.LENGTH_SHORT).show()
        edtCourseName.setText("")
        edtCourseDecription.setText("")
        edtCourseDuration.setText("")
    }
}
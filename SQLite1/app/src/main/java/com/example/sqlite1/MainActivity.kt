package com.example.sqlite1

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var helper=MyDbHelper(applicationContext)
        // readableDatabase dung de doc database
        // rawQuery() dung de tim kiem , truy van csdl
        val db =helper.readableDatabase
        var rs=db.rawQuery("SELECT * FROM USERS",null)
        if (rs.moveToFirst()){
//            Toast.makeText(
//                applicationContext,
//                rs.getString(1),
//                Toast.LENGTH_SHORT
//            ).show()
        }
        //lang nghe su kien click len btnAdd
        btnAdd.setOnClickListener {
            var cv = ContentValues()
            cv.put("UNAME",edtUsername.text.toString())
            cv.put("PWD",edtPWD.text.toString())
            db.insert("USERS",null,cv)
            Toast.makeText(applicationContext,"Da them thanh cong",Toast.LENGTH_SHORT).show()
            edtUsername.setText("")
            edtPWD.setText("")
            edtUsername.requestFocus()
        }

    }
}
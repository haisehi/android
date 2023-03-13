package com.example.sqlite1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
/*
* ctrl + p : dùng để xem hướng dẫn các constructor
* name:String? :tên db
* factory SQLiteDatabase.CursorFactory?:để tạo các đối tượng con trỏ , hoặc null cho mặc định
* version Int : số của cơ sở dữ liệu (bắt đầu từ 1)
* nếu cơ sở dữ liệu cũ hơn ,onUpgrade được sử dụng để nâng cấp cơ sở dữ liệu
* nếu cơ sở dữ liệu mới hơn ,downUpgrade được sử dụng để hạ cấp cơ sở dữ liệu
* */
class MyDbHelper(context: Context):SQLiteOpenHelper(context,"USERDB",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        //tao bang
        p0?.execSQL("CREATE TABLE USERS(" +
                "USERID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "UNAME TEXT," +
                "PWD TEXT )")
        //ADD DATA
        p0?.execSQL("INSERT INTO USERS(UNAME,PWD) VALUES('username1@gmail.com','123456')")
        p0?.execSQL("INSERT INTO USERS(UNAME,PWD) VALUES('username2@gmail.com','654321')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}
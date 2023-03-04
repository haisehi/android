package com.example.sqlite

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.Cursor

class DBHelper(context: Context, factory:SQLiteDatabase.CursorFactory?):
    SQLiteOpenHelper(context,DB_NAME,factory,DB_VERSION) {
    //variables for database
    companion object{
        private const val DB_NAME="coursedb"
        private const val DB_VERSION=1
        private const val TABLE_NAME="mycourse"
        private const val ID_COL="id"
        private const val NAME_COL="name"
        private const val DECRIPTION_COL="decription"
        private const val DURATION_COL="duration"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val query=("CREATE TABLE "+ TABLE_NAME+" ("
                + ID_COL+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME_COL+" TEXT,"
                + DECRIPTION_COL+" TEXT,"
                + DURATION_COL+" TEXT)")
        db.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("DROP TABLE IF EXISTS"+ TABLE_NAME)
        onCreate(db)
    }
    fun addNewCourse(
        courseName: String?,
        courseDecription:String?,
        courseDuration:String?
    ){
        val db=this.writableDatabase
        val values = ContentValues()
        values.put(NAME_COL,courseName)
        values.put(DECRIPTION_COL,courseDecription)
        values.put(DURATION_COL,courseDuration)
        db.insert(TABLE_NAME,null,values)
        db.close()
    }
    fun readCourse():ArrayList<course>?{
        val db=this.readableDatabase
        val cursorCourses:Cursor=db.rawQuery("SELECT*FROM $TABLE_NAME",
            null)
        val courseModalArrayList:ArrayList<course> = ArrayList()
        if (cursorCourses.moveToFirst()){
            do{
                courseModalArrayList.add(
                    course(
                        cursorCourses.getString(1),
                        cursorCourses.getString(2),
                        cursorCourses.getString(3)
                    )
                )
            }while (cursorCourses.moveToNext())
        }
        cursorCourses.close()
        return courseModalArrayList
    }
    fun updateCourse(
        originalCourseName:String,
        courseName: String?,
        courseDecription: String?,
        courseDuration: String?
    ){
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(NAME_COL,courseName)
        values.put(DECRIPTION_COL,courseDecription)
        values.put(DURATION_COL,courseDuration)
        db.update(TABLE_NAME,values,"name=?",
            arrayOf(originalCourseName))
        db.close()
    }
    fun deleteCourse(courseName: String){
        val db=this.writableDatabase
        db.delete(TABLE_NAME,"name=?", arrayOf(courseName))
        db.close()
    }
}
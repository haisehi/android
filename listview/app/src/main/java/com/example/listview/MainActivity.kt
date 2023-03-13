package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addEvents()
    }

    private fun addEvents() {
        hienthiLvQuocGia()
    }

    private fun hienthiLvQuocGia() {
        //khai bao arrQuocGia , su dung resourse de lay thong tin tu string.xml
        var arrQuocGia=resources.getStringArray(R.array.arrQuocGia)
        //gan nguon cho adapter de hien thi len xuong
        lvQuocGia.adapter=ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            arrQuocGia)

        lvQuocGia.setOnItemClickListener { adapterView,view,i,l->
            Toast.makeText(this@MainActivity,
            "bạn đã chọn "+arrQuocGia[i],
             Toast.LENGTH_SHORT
            ).show()
        }
    }
}


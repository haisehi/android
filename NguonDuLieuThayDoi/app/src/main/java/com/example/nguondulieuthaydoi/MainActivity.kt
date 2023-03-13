package com.example.nguondulieuthaydoi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //khai bao 1 list rong
    var ds:MutableList<String> = mutableListOf("0774544476","0906438065")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addEvents()
    }

    private fun addEvents() {
        hienthidanhsach()
        buttonLuu()
    }

    private fun buttonLuu() {
        btnLuu.setOnClickListener {
            hamxuly()
        }
    }

    private fun hamxuly() {
        var s:String = edtsdt.text.toString()
        ds.add(s)
        edtsdt.setText("")
        hienthidanhsach()
    }

    private fun hienthidanhsach() {
        //hien thi danh sach ban dau
        lvSDT.adapter=ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            ds
        )
    }
}
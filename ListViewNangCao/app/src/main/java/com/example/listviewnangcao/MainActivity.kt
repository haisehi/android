package com.example.listviewnangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.CursorAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter:customAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //khai bao danh sach cac item cua list
        var list = mutableListOf<outData>()
        list.add(outData(R.drawable.ao1,"ao thun nam 1","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.ao2,"ao thun nam 2","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.ao3,"ao thun nam 3","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.ao4,"ao thun nam 4","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.ao5,"ao thun nam 5","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.quan1,"quan nam 1","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.quan2,"quan nam 2","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.quan3,"quan nam 3","ao thun nam phu hop voi moi lua tuoi"))
        list.add(outData(R.drawable.quan4,"quan nam 4","ao thun nam phu hop voi moi lua tuoi"))

        customAdapter=customAdapter(this,list)
        //khai bao 1 bien de lien ket lvFashion
        var lvFashion = findViewById<ListView>(R.id.lvFashion)
        lvFashion.adapter=customAdapter

        lvFashion.onItemClickListener=AdapterView.OnItemClickListener { adpterView, view, i, id ->
            Toast.makeText(this,
            "Bạn đã chọn Iteam này"+list[i].title,
            Toast.LENGTH_SHORT).show()
        }
    }
}
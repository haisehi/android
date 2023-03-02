package com.example.intent

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2:AppCompatActivity() {
    lateinit var showText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showText=findViewById(R.id.ShowText) as TextView

        if (intent!=null){
            val data =intent.getStringExtra("MESSAGE")
            showText.text="Hello $data"
        }
    }
}
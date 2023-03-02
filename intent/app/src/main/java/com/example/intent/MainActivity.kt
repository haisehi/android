package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editTextName: TextView
    lateinit var btnClickMe: Button
    lateinit var btnDial: Button
    lateinit var editTextURL: EditText
    lateinit var btnURL: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextName = findViewById<View>(R.id.editTextName) as EditText
        btnClickMe = findViewById<View>(R.id.buttonClickMe) as Button
        btnDial = findViewById<View>(R.id.buttonDial) as Button
        btnURL = findViewById<View>(R.id.buttonURL) as Button
        editTextURL = findViewById<View>(R.id.editTextURL) as EditText
        btnClickMe.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            val yName = editTextName.text.toString()
            intent.putExtra("MESSAGE", yName)
            startActivity(intent)
        }
        btnDial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        btnURL.setOnClickListener {
            val url = editTextURL.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
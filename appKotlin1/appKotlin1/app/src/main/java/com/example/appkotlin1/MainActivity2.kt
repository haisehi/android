package com.example.appkotlin1

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val myNum1 = findViewById<EditText>(R.id.editNum1)
        val myNum2 = findViewById<EditText>(R.id.editNum2)
        val myBtnAdd = findViewById<Button>(R.id.btnAdd)
        val myBtnDiv = findViewById<Button>(R.id.btnDiv)
        val myBtnMul = findViewById<Button>(R.id.btnMul)
        val myBtnSub = findViewById<Button>(R.id.btnSub)
        val myResult = findViewById<EditText>(R.id.editResult)

//        myNum1.setText("123")
        myBtnAdd.setOnClickListener{
            val a = myNum1.text.toString().toInt()
            val b = myNum2.text.toString().toInt()
            val kq =a+b
            myResult.setText(kq.toString())
        }
        myBtnSub.setOnClickListener{
            val a = myNum1.text.toString().toInt()
            val b = myNum2.text.toString().toInt()
            val kq =a-b
            myResult.setText(kq.toString())
        }
        myBtnMul.setOnClickListener{
            val a = myNum1.text.toString().toInt()
            val b = myNum2.text.toString().toInt()
            val kq =a*b
            myResult.setText(kq.toString())
        }
        myBtnDiv.setOnClickListener{
            val a = myNum1.text.toString().toInt()
            val b = myNum2.text.toString().toInt()
            val kq =a/b
            myResult.setText(kq.toString())
        }
    }
}
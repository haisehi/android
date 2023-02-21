package com.example.appkotlin1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 : AppCompatActivity() {
    public var myButton1: Button? = null
    public var myUser1: EditText? = null
    public var myPass1: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        myButton1 = findViewById(R.id.btnOk1)
        myUser1 = findViewById(R.id.editUser1)
        myPass1 = findViewById(R.id.editPassword1)
        myButton1!!.setOnClickListener {
            if (myUser1!!.getText().toString().equals("admin") &&
                myPass1!!.getText().toString().equals("12345"))
            {
                Toast.makeText(getApplicationContext(), "Login successful",
                    Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(getApplicationContext(), "Login failed",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
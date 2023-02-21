package com.example.appkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    public var mybotton:Button?=null;
    public var myUser:EditText ?=null;
    public var myPass:EditText?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mybotton = findViewById(R.id.btnOk);
        myUser=findViewById(R.id.editUser);
        myPass=findViewById(R.id.editPassword);
    }
    fun onLogin(view: View?){
        if(myUser!!.getText().toString().equals("admin")&& myPass!!.getText().toString().equals("12345")){
            Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show()
        }
    }
}
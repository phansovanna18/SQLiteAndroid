package com.example.database


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


data class Student(val name:String,val city:String)


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun insert(v:View){
        val city ="Batdambang"
        val name ="Vanna"
        val dto1 = Student(city,name)

        val help = MyHelp(this)
        val result = help.insertData(dto1)

        if(result == (-1).toLong())
        {
            Toast.makeText(this,"Registration Failed",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Registration success $result",Toast.LENGTH_SHORT).show()
        }

    }
}

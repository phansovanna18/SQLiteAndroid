package com.example.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DB_Name = "Student"
val TABLE_NAME = "Staff"
val column1 = "city"
val column2 = "sname"

class MyHelp(context: Context) :SQLiteOpenHelper(context, DB_Name,null,1){

    override fun onCreate(p0: SQLiteDatabase?) {
        var create_table = "create table $TABLE_NAME($column1 varchar(250), $column2 varchar(250)) "
        p0?.execSQL(create_table)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    fun insertData(dto : Student):Long
    {
        val cv = ContentValues()
        cv.put(column1,dto.name)
        cv.put(column2,dto.city)
        val db = this.writableDatabase
        val res = db.insert(TABLE_NAME,null,cv)
        return res
    }
}

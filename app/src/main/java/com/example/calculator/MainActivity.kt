package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberevent(view: View) {
        var buclick=view.findViewById<EditText>(R.id.editText).text.toString()
        var buselect= view as Button
        when(buselect.id){
            R.id.bu1->{buclick += "1"}
            R.id.bu2->{buclick += "2"}
            R.id.bu3->{buclick += "3"}
            R.id.bu4->{buclick += "4"}
            R.id.bu5->{buclick += "5"}
            R.id.bu6->{buclick += "6"}
            R.id.bu7->{buclick += "7"}
            R.id.bu8->{buclick += "8"}
            R.id.bu9->{buclick += "9"}
            R.id.bu0->{buclick += "0 "}
        }
        view.findViewById<EditText>(R.id.editText).setText(buclick)
    }
}
package com.example.proyectosesion3

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MyFirstActivity : Activity() {

    lateinit var btn : Button
    lateinit var contador1 : TextView
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myfirstactivty)

        btn = findViewById(R.id.button)
        contador1 = findViewById(R.id.textView)

        btn.setOnClickListener{
            contador++

            contador1.text = contador.toString()
        }
    }

    override fun onResume() {
        super.onResume()

        //Toast.makeText(this, "hola", Toast.LENGTH_LONG).show()

        /*val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.youtube.com/")
        startActivity(intent)*/

        /*val intent = Intent(this, MySecondActivity::class.java)
        startActivity(intent)*/

    }



}
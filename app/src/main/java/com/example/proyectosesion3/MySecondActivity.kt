package com.example.proyectosesion3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MySecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_second)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Bienvenido a nimalaya XD", Toast.LENGTH_LONG).show()
    }
}
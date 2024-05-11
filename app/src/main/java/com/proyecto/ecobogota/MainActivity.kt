package com.proyecto.ecobogota

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)

        setTheme(R.style.Theme_EcoBogota)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

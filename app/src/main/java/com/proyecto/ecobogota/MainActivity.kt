package com.proyecto.ecobogota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)

        setTheme(R.style.Theme_EcoBogota)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.log_cuenta)
        btn.setOnClickListener {

            val intent: Intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)


        }

        val textemail = findViewById<TextView>(R.id.text_recuperar)
        textemail.setOnClickListener {
            logtextrecuperar()

        }

        val textregistro = findViewById<TextView>(R.id.text_registro)
        textregistro.setOnClickListener{
            logtextregistro()

        }

    }

    private fun logtextregistro (){
        val i = Intent (this,RegistroActivity::class.java)
        startActivity(i)
    }

    private fun logtextrecuperar () {
        val l = Intent ( this,CorreoActivity::class.java)
        startActivity(l)
    }
}

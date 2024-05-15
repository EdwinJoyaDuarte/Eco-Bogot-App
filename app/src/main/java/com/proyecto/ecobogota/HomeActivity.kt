package com.proyecto.ecobogota


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.proyecto.ecobogota.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(InicioFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId){

                R.id.nav_inicio -> replaceFragment(InicioFragment())
                R.id.nav_novedades -> replaceFragment(NovedadesFragment())
                R.id.nav_reutiliza -> replaceFragment(ReutilizaFragment())
                R.id.nav_perfil -> replaceFragment(PerfilFragment())

                else -> {

                }

            }
            true
        }


    }

    private fun replaceFragment(fragment : Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()

    }

}
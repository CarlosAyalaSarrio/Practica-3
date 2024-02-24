package net.iessochoa.carlosayalasarrio.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.iessochoa.carlosayalasarrio.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var num: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNumero.text=num.toString()

        binding.btSumaUno.setOnClickListener(){

            num ++
            binding.tvNumero.text=num.toString()
        }
    }
}
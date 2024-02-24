package net.iessochoa.carlosayalasarrio.practica3

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import net.iessochoa.carlosayalasarrio.practica3.databinding.ActivityMainBinding

private const val TAG = "practica3"
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //var num: Int = 0
    val model:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.tvNumero.text=model.contador.toString()

        binding.btSumaUno.setOnClickListener(){

            model.sumaUno()
            binding.tvNumero.text=model.contador.toString()
        }
    }

        override fun onStart() {
            super.onStart()
            Log.i(TAG, "onStart")
        }

        override fun onResume() {
            super.onResume()
            Log.i(TAG, "onResume")
        }

        override fun onPause() {
            Log.i(TAG, "onPause")
            super.onPause()
        }

        override fun onStop() {
            Log.i(TAG, "onStop")
            super.onStop()
        }

        override fun onRestart() {
            super.onRestart()
            Log.i(TAG, "onRestart")
        }

        override fun onDestroy() {
            Log.i(TAG, "onDestroy")
            super.onDestroy()
        }
    }


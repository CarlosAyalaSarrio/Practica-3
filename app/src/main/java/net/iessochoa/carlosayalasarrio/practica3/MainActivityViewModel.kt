package net.iessochoa.carlosayalasarrio.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    //var contador:Int=0

    private val _asteriscos = MutableLiveData<String>("")
    val asteriscos: LiveData<String> = _asteriscos

    private val contador=MutableLiveData<Int>(0)
    fun sumaUno(){
        contador.value= contador.value?.plus(1)
    }

    fun getContador():LiveData<Int>{
        return contador
    }

    fun addAsteriscos() {
        _asteriscos.value = _asteriscos.value + "*"
    }
}
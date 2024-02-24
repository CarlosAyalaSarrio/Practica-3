package net.iessochoa.carlosayalasarrio.practica3

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var contador:Int=0

    fun sumaUno(){
        contador++
    }

}
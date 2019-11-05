package com.jcsoftia.suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contador:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contador = 0;

    }
    fun incrementarContador(Vista:View) {
        contador++;
        mostrarResultado();

    }
    fun restaContador(Vista:View) {
        contador--;
        mostrarResultado();
    }
    fun reseteaContador(Vista:View) {
        contador = 0;
        mostrarResultado();
    }
    fun mostrarResultado() {
        val textoResultado = findViewById(R.id.contPulsaciones) as TextView
        textoResultado.setText("Contador: " + contador)
    }

}

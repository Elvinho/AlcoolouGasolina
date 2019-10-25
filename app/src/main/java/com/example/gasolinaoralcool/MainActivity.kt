package com.example.gasolinaoralcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View){

        var gasolina = editText.text.toString().toDouble()

        var etanol = editText2.text.toString().toDouble()

        var resultado = etanol/gasolina

        if( resultado < 0.7 ){
            textView2.text = getString(R.string.txt_alcool)
        }
        else{
            textView2.text = getString(R.string.txt_gasolina)
        }
    }
}

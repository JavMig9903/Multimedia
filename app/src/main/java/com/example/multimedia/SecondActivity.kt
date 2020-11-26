package com.example.multimedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.multimedia.MainActivity.Companion.EJEX

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondlayout)

        val textv = findViewById<TextView>(R.id.textView)
        val invertir = findViewById<Button>(R.id.button2)
        val duplicar = findViewById<Button>(R.id.button)
        val reemplaz = findViewById<Button>(R.id.button3)
        val edit2 = findViewById<EditText>(R.id.Edt2)

        val str = intent.getStringExtra(EJEX)


        str?.let {
            var convertir = str.split(",").toMutableList()
            var mostrar = ""
            convertir.forEach{
                mostrar += it+"\n"
            }
            textv.text = mostrar
        }

        invertir.setOnClickListener{
            str?.let {
                var convertir = str.split(",").toMutableList()
                convertir.reverse()
                var mostrar =""
                convertir.forEach{
                    mostrar += it+"\n"
                }
                textv.text = mostrar
            }
        }

        duplicar.setOnClickListener{
            str?.let {
                val  vocales: List<Char> =listOf('a','e','i','o','u','A','E','I','O','U');
                var convertir = str.split(",").toMutableList()
                var palabras = ""
                var mostrar = ""
                convertir.forEach{
                    var cadena = it
                    cadena.forEach{
                        if(it in vocales ){
                             palabras = cadena.replace(it.toString(),it+it.toString())
                        }
                    }
                    mostrar+=palabras+"\n"
                }
                textv.text = mostrar
            }
        }
        reemplaz.setOnClickListener{
            str?.let {
                var convertir = str.split(",").toMutableList()
                val  vocales: List<Char> =listOf('a','e','i','o','u');
                var mostrar =""
                val letra = edit2.text.toString().get(0).toLowerCase()
                if(!edit2.text.isNullOrEmpty() && letra in vocales){
                    convertir.forEach {
                        val palabra = it.replace(letra.toString()," :D ")
                        mostrar += palabra+"\n"
                    }
                }
                textv.text = mostrar
            }
        }


    }
}
package com.example.multimedia

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    companion object {
        const val EJEX ="Ejercicio1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt = findViewById<EditText>(R.id.Edt1)
        val bot = findViewById<Button>(R.id.button1)

        edt.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence,start: Int,before: Int,count: Int) {
                val  ejemplo = edt.text.split(",");
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable) {
            }
        })

        bot.setOnClickListener{
            val intent =  Intent ( this, SecondActivity :: class .java)
            intent.putStringExtra(EJEX,ejemplo)
            startActivity (intent)
        }


        //conversionLista = textoObtenido.split(" ").toMutableList()


    }
}

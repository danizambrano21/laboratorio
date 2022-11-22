package com.example.laboratorioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Reservar : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservar)

        //Declaro variables de componentes
        val btnCompu1= findViewById<ImageButton>(R.id.imgBtn1)
        val btnCompu2= findViewById<ImageButton>(R.id.imgBtn2)
        val btnCompu3= findViewById<ImageButton>(R.id.imgBtn3)
        val btnCompu4= findViewById<ImageButton>(R.id.imgBtn4)
        val btnCompu5= findViewById<ImageButton>(R.id.imgBtn5)
        val btnCompu6= findViewById<ImageButton>(R.id.imgBtn6)


        btnCompu1.setOnClickListener {
            Toast.makeText(
                this,
                "Felicidades, haz reservado con éxito la computadora N°1",
                Toast.LENGTH_LONG
            ).show()
            Finalizar()
        }

        btnCompu2.setOnClickListener {
            Toast.makeText(
                this,
                "Felicidades, haz reservado con éxito la computadora N°2",
                Toast.LENGTH_LONG
            ).show()
            Finalizar()
        }

        btnCompu3.setOnClickListener {
            Toast.makeText(
                this,
                "Felicidades, haz reservado con éxito la computadora N°3",
                Toast.LENGTH_LONG
            ).show()
            Finalizar()
        }

        btnCompu4.setOnClickListener {
            Toast.makeText(
                this,
                "Felicidades, haz reservado con éxito la computadora N°4",
                Toast.LENGTH_LONG
            ).show()
            Finalizar()
        }

        btnCompu5.setOnClickListener {
            Toast.makeText(
                this,
                "Felicidades, haz reservado con éxito la computadora N°5",
                Toast.LENGTH_LONG
            ).show()
            Finalizar()
        }

        btnCompu6.setOnClickListener {
            Toast.makeText(
                this,
                "Felicidades, haz reservado con éxito la computadora N°6",
                Toast.LENGTH_LONG
            ).show()
            Finalizar()
        }


    }


    fun Finalizar(){
        var usuario4: Usuarios? = intent.getParcelableExtra<Usuarios>("usuarioReserva")

        val miIntentAnterior = Intent(this, LaboratorioActivity::class.java)
        miIntentAnterior.putExtra("UsuarioLogueado",usuario4)
        startActivity(miIntentAnterior)
    }
}
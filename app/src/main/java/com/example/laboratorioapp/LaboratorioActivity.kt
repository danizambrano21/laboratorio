package com.example.laboratorioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.system.exitProcess

class LaboratorioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laboratorio)

        getData()

    }

    fun getData(){

        val imgBotonReservar = findViewById<ImageButton>(R.id.imgBtnReservar)
        val imgBotonConstancia = findViewById<ImageButton>(R.id.imgBtnConstancia)
        val botonSalir = findViewById<Button>(R.id.btnSalir)
        val txtNom = findViewById<TextView>(R.id.textView)
        val txtNum = findViewById<TextView>(R.id.textView2)


        var usuario3: Usuarios? = intent.getParcelableExtra<Usuarios>("usuarioLogueado")
        txtNom.text = usuario3!!.nombreUsuario
        txtNum.text = usuario3!!.numDocumento.toString()

        imgBotonReservar.setOnClickListener(){
            var intentReservar = Intent(this, Reservar::class.java)
            intentReservar.putExtra("usuarioReserva",usuario3)
            startActivity(intentReservar)
        }

        imgBotonConstancia.setOnClickListener(){
            Toast.makeText(this,"Se envío una notificación a la administración del ISTIC con tu solicitud",
                Toast.LENGTH_LONG).show()
        }

        botonSalir.setOnClickListener(){
            finishAffinity()
            exitProcess(0)
        }
    }
}
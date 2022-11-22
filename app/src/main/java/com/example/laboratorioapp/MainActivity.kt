package com.example.laboratorioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presioname =findViewById<Button>(R.id.BtnSubir)
        presioname.setOnClickListener(){
            setData()
        }
    }



    fun setData() {

        val nombre = findViewById<EditText>(R.id.editTxtName)
        val numero = findViewById<EditText>(R.id.editTxtNumero)
        //convertir los datos
        val nombreC = nombre.text.toString()
        val numeroC= numero.text.toString().toInt()
        val grupo=""
        val vacuna=""
        val dosis=0

        //creo un objeto
        val user1 = Usuarios (1,nombreC,numeroC,grupo,vacuna,dosis)

        //objeto intent

        var intent = Intent(this, IngresoActivity::class.java)
        intent.putExtra("usuario1",user1)
        startActivity(intent)

    }



}

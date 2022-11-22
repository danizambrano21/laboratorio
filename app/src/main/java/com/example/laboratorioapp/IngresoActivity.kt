package com.example.laboratorioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class IngresoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        getData()


    }


    fun getData(){
        var usuario2: Usuarios? = intent.getParcelableExtra<Usuarios>("usuario1")

        val txtNombre = findViewById<TextView>(R.id.txtNombre)
        val txtNum = findViewById<TextView>(R.id.txtNum)

        val editTxtGrupoRiesgo = findViewById<EditText>(R.id.editTxtGrupoRiesgo)
        val editTxtVacuna = findViewById<EditText>(R.id.editTxtVacuna)
        val editTxtDosis = findViewById<EditText>(R.id.editTxtDosis)

        var msj: String = usuario2!!.validarVacunacion().toString()

        txtNombre.text = usuario2!!.nombreUsuario
        txtNum.text = usuario2!!.numDocumento.toString()

        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener(){

            if (editTxtGrupoRiesgo.text.toString() == "No") {
                if (editTxtVacuna.text.toString() == "Si") {
                    if ((editTxtDosis.text.toString()).toInt() >= 2) {
                        Toast.makeText(
                            this,
                            "¡Tu ingreso al laboratorio fue aprobado! " + msj,
                            Toast.LENGTH_LONG
                        ).show()



                        var intentTerceraActivity = Intent(this, LaboratorioActivity::class.java)
                        intentTerceraActivity.putExtra("usuarioLogueado",usuario2)
                        startActivity(intentTerceraActivity)
                    }
                }
            }
            if (editTxtGrupoRiesgo.text.toString() == "Si") {
                if (editTxtVacuna.text.toString() == "Si") {
                    if ((editTxtDosis.text.toString()).toInt() >= 2) {
                        Toast.makeText(
                            this,
                            "¡Tu ingreso al laboratorio fue aprobado! " + msj,
                            Toast.LENGTH_LONG
                        ).show()

                        var intentTerceraActivity = Intent(this, LaboratorioActivity::class.java)
                        intentTerceraActivity.putExtra("usuarioLogueado", usuario2)
                        startActivity(intentTerceraActivity)
                    }

                }
            }
            if (editTxtGrupoRiesgo.text.toString() == "Si") {
                if (editTxtVacuna.text.toString() == "No") {
                    if(editTxtDosis.text.toString().isEmpty()){
                        Toast.makeText(
                            this,
                            "No podés ingresar, si perteneces a grupos de riesgo debes tener el esquema de vacunación completo",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
            if (editTxtGrupoRiesgo.text.toString() == "No") {
                if (editTxtVacuna.text.toString() == "Si") {
                    if ((editTxtDosis.text.toString()).toInt() < 2) {
                        Toast.makeText(
                            this,
                            "Tu ingreso al laboratorio fue denegado por no tener el esquema de vacunación completo",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
            if (editTxtGrupoRiesgo.text.toString() == "No") {
                if (editTxtVacuna.text.toString() == "No") {
                    if(editTxtDosis.text.toString().isEmpty()) {
                        Toast.makeText(
                            this,
                            "Tu ingreso al laboratorio fue denegado por no tener el esquema de vacunación completo",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
            if (editTxtGrupoRiesgo.text.toString() == "Si") {
                if (editTxtVacuna.text.toString() == "Si") {
                    if ((editTxtDosis.text.toString()).toInt() < 2) {
                        Toast.makeText(
                            this,
                            "Tu ingreso al laboratorio fue denegado por no tener el esquema de vacunación completo y pertenecer a los grupos de riesgo",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        }



    }
}
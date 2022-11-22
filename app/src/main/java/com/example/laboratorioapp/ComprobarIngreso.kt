package com.example.laboratorioapp

interface ComprobarIngreso {
    var grupoRiesgo: String
    var vacunas:String
    var dosis:Int

    fun validarVacunacion() : String {
        return "Tienes el esquema de vacunación completo"
    }

}
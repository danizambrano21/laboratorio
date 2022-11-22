package com.example.laboratorioapp

import android.os.Parcel
import android.os.Parcelable

data class Usuarios (var IdUsuario : Int, var nombreUsuario:String, var numDocumento:Int,
                     override var grupoRiesgo : String,
                     override var vacunas : String,
                     override var dosis : Int
) : ComprobarIngreso, Parcelable {
    constructor(parcel : Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel : Parcel, flags : Int) {
        parcel.writeInt(IdUsuario)
        parcel.writeString(nombreUsuario)
        parcel.writeInt(numDocumento)
        parcel.writeString(grupoRiesgo)
        parcel.writeString(vacunas)
        parcel.writeInt(dosis)
    }

    override fun describeContents() : Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Usuarios> {
        override fun createFromParcel(parcel : Parcel) : Usuarios {
            return Usuarios(parcel)
        }

        override fun newArray(size : Int) : Array<Usuarios?> {
            return arrayOfNulls(size)
        }
    }

    override fun validarVacunacion() : String {
        super.validarVacunacion()
        return "Tienes la vacunación completa"
    }
}
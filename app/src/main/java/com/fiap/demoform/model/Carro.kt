package com.fiap.demoform.model

import android.os.Parcel
import android.os.Parcelable

data class Carro(
    val modelo:String,
    val placa:String
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    constructor(modelo: String): this(modelo, "")

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(modelo)
        parcel.writeString(placa)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Carro> {
        override fun createFromParcel(parcel: Parcel): Carro {
            return Carro(parcel)
        }

        override fun newArray(size: Int): Array<Carro?> {
            return arrayOfNulls(size)
        }
    }
}

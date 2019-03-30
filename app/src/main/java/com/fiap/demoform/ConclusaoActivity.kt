package com.fiap.demoform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fiap.demoform.model.Carro
import kotlinx.android.synthetic.main.activity_main.*

class ConclusaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conclusao)

        val modelo = intent.getStringExtra("MODELO")
        val placa = intent.getStringExtra("PLACA")

        val carro = intent.getParcelableExtra<Carro>("CARRO")

        val mensagem = "Carro - ${carro.modelo} - Placa ${carro.placa}"
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
    }
}

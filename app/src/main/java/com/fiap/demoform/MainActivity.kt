package com.fiap.demoform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fiap.demoform.model.Carro
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCadastrar.setOnClickListener {
            val proximaTela = Intent(this,
                    ConclusaoActivity::class.java)
            proximaTela.putExtra("MODELO", inputModelo.text.toString())
            proximaTela.putExtra("PLACA", inputPlaca.text.toString())

            val carro = Carro(inputModelo.text.toString(),
                    inputPlaca.text.toString())

            proximaTela.putExtra("CARRO", carro)

            startActivity(proximaTela)
        }
    }
}

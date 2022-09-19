package com.example.login4m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnConectar: Button = findViewById(R.id.btnConectar)
        btnConectar.setOnClickListener{
            Toast.makeText(this,"Você clicou",Toast.LENGTH_LONG).show()
        }

        //Usuarios
        val usuarios= HashMap<String,String>()
        usuarios["epaminondas"] = "epaminondas"

    }
}

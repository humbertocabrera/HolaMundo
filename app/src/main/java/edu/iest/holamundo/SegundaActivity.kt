package edu.iest.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import edu.iest.botones.MainActivity

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        var bnAbrirPantalla = findViewById<Button>(R.id.btnPantalla)
        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener {
            finish()
        }
    }
}
package com.example.s10_trabajo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerTareas = findViewById<RecyclerView>(R.id.recyclerTareas)

        val tareas = listOf(
            "Comprar pan",
            "Llamar a mama",
            "Terminar proyecto",
            "Estudiar Android",
            "ir al gimnasio"
        )

        recyclerTareas.layoutManager = LinearLayoutManager(this)
        recyclerTareas.adapter = TareaAdapter(tareas)

        }
    }
}
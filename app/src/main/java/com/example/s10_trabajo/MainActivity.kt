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

        val productos = listOf(
            Producto("Arroz 2kg", R.drawable.imagen4, "Abastos", 5.25F),
            Producto("Azucar 2kg", R.drawable.imagen4, "Abastos", 25.20F),
            Producto("Detergente", R.drawable.imagen4, "Limpieza", 10.20F),
            Producto("Aceite", R.drawable.imagen4, "Abastos", 12.20F),
            Producto("Dulces",R.drawable.imagen4,"Abastos",11.20F),
            Producto("Atun", R.drawable.imagen4, "Abastos", 5.20F),
            Producto("Café",R.drawable.imagen4,"Abastos", 3.20F)
        )

        recyclerTareas.layoutManager = LinearLayoutManager(this)
        recyclerTareas.adapter = ProductoAdapter(productos)

    }
}

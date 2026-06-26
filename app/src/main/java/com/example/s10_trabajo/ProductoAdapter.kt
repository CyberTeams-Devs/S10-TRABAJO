package com.example.s10_trabajo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductoAdapter(private val listaProductos: List<Producto>) :
    RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>() {

    class ProductoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivProducto: ImageView = itemView.findViewById(R.id.ivFoto)
        val tvNombreProducto: TextView = itemView.findViewById(R.id.tvNombreProducto)
        val tvPrecio: TextView = itemView.findViewById(R.id.tvPrecio)
        val tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_producto, parent, false)
        return ProductoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val producto = listaProductos[position]

        holder.ivProducto.setImageResource(producto.imagenResId)
        holder.tvNombreProducto.text = producto.nombre
        holder.tvCategoria.text = producto.categoria
        holder.tvPrecio.text = producto.precio.toString()
    }

    override fun getItemCount(): Int {
        return listaProductos.size
    }
}
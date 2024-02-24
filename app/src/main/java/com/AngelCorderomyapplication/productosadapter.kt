package com.AngelCorderomyapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class productosadapter(var context: Context,
    var ListaProductos: MutableList<dtProductos>)  :
    RecyclerView.Adapter<productosadapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView
        init {
            txtid=itemView.findViewById(R.id.txtID)
        }
        lateinit var txtdescripcion: TextView
        init {
            txtdescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtmenudeo: TextView
        init {
            txtmenudeo=itemView.findViewById(R.id.txtMenudeo)
        }
        lateinit var txtmayoreo: TextView
        init {
            txtmayoreo=itemView.findViewById(R.id.txtMayoreo)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productosadapter.vHolder {
      var itemView = LayoutInflater.from(context).inflate(
          R.layout.vista_productos,parent,false)
    return vHolder(itemView)
    }

    override fun getItemCount(): Int {
      return ListaProductos.size
    }

    override fun onBindViewHolder(holder: productosadapter.vHolder, position: Int) {
      var producto = ListaProductos[position]
        holder.txtid.text=producto.ID
        holder.txtdescripcion.text=producto.descripcion
        holder.txtmenudeo.text=producto.menudeo
        holder.txtmayoreo.text=producto.mayoreo
    }


}
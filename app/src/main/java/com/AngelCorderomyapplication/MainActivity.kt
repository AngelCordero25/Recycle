package com.AngelCorderomyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaproductos : MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaproductos.add(
            dtProductos("1322","Agua potable","$15","$10")
        )
        listaproductos.add(
            dtProductos("13356","Agua Mineral","$16","$11")
        )
        listaproductos.add(
            dtProductos("1257","Banda de tiempo","$16","$197")
                    )
        listaproductos.add(
            dtProductos("1257", "Banda de tiempo", "$16", "$197")
        )

        listaproductos.add(
            dtProductos("2348", "Filtro de aceite", "$8", "$12")
        )

        listaproductos.add(
            dtProductos("3569", "Juego de llaves", "$30", "$45")
        )

        listaproductos.add(
            dtProductos("4892", "Aceite de motor", "$25", "$30")
        )

        listaproductos.add(
            dtProductos("5910", "Llanta de repuesto", "$50", "$60")
        )

        listaproductos.add(
            dtProductos("6723", "Batería de coche", "$80", "$100")
        )

        listaproductos.add(
            dtProductos("7184", "Herramienta de diagnóstico", "$150", "$180")
        )

        listaproductos.add(
            dtProductos("8235", "Pastillas de freno", "$20", "$25")
        )

        listaproductos.add(
            dtProductos("9466", "Filtro de aire", "$12", "$15")
        )

        listaproductos.add(
            dtProductos("10578", "Líquido de frenos", "$10", "$12")
        )

        listaproductos.add(
            dtProductos("11239", "Luz de freno", "$5", "$8")
        )

        listaproductos.add(
            dtProductos("12740", "Gato hidráulico", "$40", "$50")
        )

        listaproductos.add(
            dtProductos("13461", "Termostato", "$15", "$20")
        )

        listaproductos.add(
            dtProductos("14792", "Cables de bujías", "$7", "$10")
        )

        listaproductos.add(
            dtProductos("15203", "Líquido refrigerante", "$8", "$10")
        )

        listaproductos.add(
            dtProductos("16734", "Llave inglesa ajustable", "$10", "$15")
        )

        listaproductos.add(
            dtProductos("17375", "Limpiador de inyectores", "$12", "$18")
        )

        listaproductos.add(
            dtProductos("18896", "Bujías de encendido", "$3", "$5")
        )

        listaproductos.add(
            dtProductos("19527", "Anticongelante", "$7", "$9")
        )

        listaproductos.add(
            dtProductos("20958", "Caja de herramientas", "$60", "$75")
        )
var tabla = findViewById<RecyclerView>(R.id.tablaproductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productosadapter(this,listaproductos)



    }
}
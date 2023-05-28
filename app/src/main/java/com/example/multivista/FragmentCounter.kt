package com.example.multivista

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment


class FragmentCounter : Fragment(R.layout.fragment_counter) {

    private lateinit var btnIncrement: Button
    private lateinit var btnDecrease: Button
    private lateinit var txtcounter: EditText
    private var counter = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        btnIncrement = view.findViewById(R.id.btnaumentar)
        btnDecrease = view.findViewById(R.id.btndisminuir)
        txtcounter = view.findViewById(R.id.txtcounter)


        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter", 0) // Obtener el contador guardado
            txtcounter.setText(counter.toString()) // Actualizar el texto del EditText
        }

        // Actualizar el texto del EditText con el valor actual del contador
        btnIncrement.setOnClickListener{
            counter++
            txtcounter.setText(counter.toString())
        }
        btnDecrease.setOnClickListener {
            if (counter>0){
                counter--
                txtcounter.setText(counter.toString())
            }
        }

        return view
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter", 0) // Obtener el contador guardado
            txtcounter.setText(counter.toString()) // Actualizar el texto del EditText
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter) // Guardar el contador en el estado del fragment
    }


}
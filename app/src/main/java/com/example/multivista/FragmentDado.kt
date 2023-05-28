package com.example.multivista

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class FragmentDado : Fragment() {

    private lateinit var dado: ImageView
    private lateinit var buttonCall: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_dado, container, false)

        dado = view.findViewById(R.id.dado)
        buttonCall = view.findViewById(R.id.buttonCall)

        buttonCall.setOnClickListener {
            val dice = Dice(numSlides = 6)

            when(dice.roll()){
                1 -> dado.setImageResource(R.drawable.dado_1)
                2 -> dado.setImageResource(R.drawable.dado_2)
                3 -> dado.setImageResource(R.drawable.dado_3)
                4 -> dado.setImageResource(R.drawable.dado_4)
                5 -> dado.setImageResource(R.drawable.dado_5)
                6 -> dado.setImageResource(R.drawable.dado_6)
            }
        }

        return  view
    }


}
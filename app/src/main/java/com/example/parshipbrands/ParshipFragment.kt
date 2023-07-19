package com.example.parshipbrands

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.parshipbrands.databinding.ParshipFragmentBinding
import com.example.parshipbrands.model.MainViewModel


class ParshipFragment : Fragment() {

    private lateinit var binding : ParshipFragmentBinding
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ParshipFragmentBinding.inflate(inflater)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.toggleButtonParship.setOnClickListener {

            viewModel.mainFunc(binding.parshipTV)

        }
    }

    /*
    * Diese Funktionen wurden für die Unit-Tests geschrieben.
    * Durch diese Funktionen werden die jeweiligen Elemente & Zustände in der Test-Klasse überprüft.
    */
//* * * * ============================= * * * ================================ * * * *//
    fun performToggleClick() {
        binding.toggleButtonParship.performClick() // <- Überprüfung des Buttons, der Toggle Funktion.
    }

    fun getNeedBoolean() : Boolean { // <- Überprüfung des Boolean Wertes
        return viewModel.needBoolean
    }

    fun getParshipText(): String {
        return binding.parshipTV.text.toString() // <- Überprüfung des Zustandes der TextView
    }

    fun getParshipTextColor(): Int {
        return binding.parshipTV.currentTextColor // <- Überprüfung des Zustandes des TextColors
    }
//* * * * ============================ * * * ================================= * * * *//
}
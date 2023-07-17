package com.example.parshipbrands

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.parshipbrands.databinding.ParshipFragmentBinding

class ParshipFragment : Fragment() {

    private lateinit var binding : ParshipFragmentBinding // Binding erstellt für das Binding zum parship_fragment.xml


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ParshipFragmentBinding.inflate(inflater)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var needBoolean = false

        binding.toggleButtonParship.setOnClickListener {

            if (!needBoolean) {
                needBoolean = true
                binding.parshipTV.text = "Elitepartner"
                binding.parshipTV.setTextColor(Color.BLUE)

            } else {
                Log.d("BOOLEAN","$needBoolean")
                needBoolean = false
                binding.parshipTV.text = "Parship"
                binding.parshipTV.setTextColor(Color.RED)
            }
        }
    }
}
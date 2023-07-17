package com.example.parshipbrands

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.parshipbrands.databinding.ParshipFragmentBinding


class ParshipFragment : Fragment() {

    private lateinit var binding : ParshipFragmentBinding // Binding erstellt für das Binding zum parship_fragment.xml

    private var needBoolean = false

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

            if (!needBoolean) {
                needBoolean = true
                binding.parshipTV.text = "Elitepartner"
                binding.parshipTV.setTextColor(Color.BLUE)

            } else {
                needBoolean = false
                binding.parshipTV.text = "Parship"
                binding.parshipTV.setTextColor(Color.RED)
            }
        }
    }

    fun performToggleClick() {
        binding.toggleButtonParship.performClick()
    }

    fun getNeedBoolean() : Boolean {
        return needBoolean
    }

    fun getParshipText(): String {
        return binding.parshipTV.text.toString()
    }

    fun getParshipTextColor(): Int {
        return binding.parshipTV.currentTextColor
    }

}
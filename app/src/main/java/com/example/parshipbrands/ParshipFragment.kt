package com.example.parshipbrands

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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


    }
}
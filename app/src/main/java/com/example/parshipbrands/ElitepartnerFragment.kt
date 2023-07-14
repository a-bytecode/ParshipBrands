package com.example.parshipbrands

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.parshipbrands.databinding.ElitepartnerFragmentBinding

class ElitepartnerFragment : Fragment() {

    private lateinit var binding : ElitepartnerFragmentBinding // Binding erstellt für das Binding zum parship_fragment.xml


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ElitepartnerFragmentBinding.inflate(inflater)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }
}
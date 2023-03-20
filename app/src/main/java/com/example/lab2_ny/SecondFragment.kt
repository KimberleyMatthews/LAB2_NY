package com.example.lab2_ny

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.lab2_ny.databinding.ActivityMainBinding
import com.example.lab2_ny.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentSecondBinding // Initialize Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment

        val view = binding.root

        val swColor: SwitchCompat = binding.swColor

        return view
    }
}
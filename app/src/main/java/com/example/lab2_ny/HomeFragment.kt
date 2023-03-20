package com.example.lab2_ny

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lab2_ny.databinding.ActivityMainBinding
import com.example.lab2_ny.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {

            binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

            val view = binding.root

            val btnDesign = binding.btnDesign
            val btnAbout = binding.btnAbout

            btnDesign.setOnClickListener(){
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_secondFragment)
            }
            btnAbout.setOnClickListener(){
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_fragment_About)
            }

            return view
        }
    }
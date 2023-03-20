package com.example.lab2_ny

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab2_ny.databinding.FragmentFirstBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!                // Getter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        // ? = kan vara null
    ): View? {

        // Setup for ViewBinding
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        val fbaCloseFragment = binding.fbaCloseFragment

        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_first, container, false)

        // SetOnClick
        fbaCloseFragment.setOnClickListener() {
            parentFragmentManager.beginTransaction().remove(this).commit()
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
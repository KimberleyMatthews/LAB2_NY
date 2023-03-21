package com.example.lab2_ny

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Lifecycle.*
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.lab2_ny.databinding.ActivityMainBinding
import com.example.lab2_ny.databinding.FragmentSecondBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding // Initialize Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    @SuppressLint("UnsafeRepeatOnLifecycleDetector")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment

        // ID's
        val view = binding.root
        val btnCount: Button = binding.btnCount
        val tvCounterValue: TextView = binding.tvCounterValue

        // *Don't forget dependencies
        //  ViewModel
        val counterViewModel by viewModels<CountViewModel>()

        // ViewModel lifeCycle
        lifecycleScope.launch {
            repeatOnLifecycle(State.STARTED) {
                counterViewModel.uiState.collect() {

                    // Update UI Elements, logics
                    tvCounterValue.text = counterViewModel.uiState.value.counterValue.toString()

                }
            }
        }

        // OnClick ViewModel Value +1
        btnCount.setOnClickListener() {
            counterViewModel.add()
        }

        return view
    }
}
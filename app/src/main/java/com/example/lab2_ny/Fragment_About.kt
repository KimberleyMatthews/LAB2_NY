package com.example.lab2_ny

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lab2_ny.databinding.FragmentAboutBinding
import com.example.lab2_ny.databinding.FragmentHomeBinding
import com.example.lab2_ny.databinding.FragmentNewsletterBinding
import com.google.android.material.snackbar.Snackbar

class FragmentAbout : Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentAboutBinding.inflate(layoutInflater, container, false)

        val view = binding.root
        val btnSignIn = binding.button

        btnSignIn.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_fragment_About_to_newsletterFragment)
        }

        return view
    }
}
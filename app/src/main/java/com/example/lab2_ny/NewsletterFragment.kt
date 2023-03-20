package com.example.lab2_ny

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lab2_ny.databinding.FragmentHomeBinding
import com.example.lab2_ny.databinding.FragmentNewsletterBinding
import com.google.android.material.snackbar.Snackbar

class NewsletterFragment : Fragment() {

    private lateinit var binding: FragmentNewsletterBinding

    private val emailList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private inner class MyUndoListener : View.OnClickListener {
        override fun onClick(v: View) {
            emailList.removeAt(emailList.lastIndex) // plockar bort email
                println("Was clicked")
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentNewsletterBinding.inflate(layoutInflater, container, false)

        val view = binding.root

        val btnSubmit = binding.btnSubmit
        val btnBack = binding.floatingActionButton
        val tvEmail = binding.editTextTextPersonName

        btnSubmit.setOnClickListener(){
            val userEmail = tvEmail.text.toString() // plockar upp emailadress
               emailList.add(userEmail)
            println(emailList)
            Snackbar.make(binding.root, "Thank you for subscribing!", Snackbar.LENGTH_SHORT)
                .setAction("UNDO", MyUndoListener()
                ).show()
        }

        btnBack.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_newsletterFragment_to_homeFragment)
        }

        return view
    }
}
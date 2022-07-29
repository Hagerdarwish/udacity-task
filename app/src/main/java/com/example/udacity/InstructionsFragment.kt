package com.example.udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.udacity.databinding.FragmentInstructionsBinding
import com.example.udacity.databinding.FragmentWelcomeBinding


class InstructionsFragment : Fragment() {
    lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        binding.btnInstra .setOnClickListener {
                view:View ->
            Navigation.findNavController(view).navigate(R.id.action_instructionsFragment_to_listFragment)
        }
        return binding.root

    }
}
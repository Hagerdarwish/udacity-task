package com.example.udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.udacity.databinding.FragmentLoginBinding
import com.example.udacity.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {
    lateinit var binding:FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentWelcomeBinding.inflate(inflater,container,false)
        binding.btnWelcome.setOnClickListener {
                view:View ->
            Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }
        return binding.root

    }



}
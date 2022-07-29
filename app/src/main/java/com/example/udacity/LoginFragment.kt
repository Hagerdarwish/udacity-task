package com.example.udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.udacity.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
   lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentLoginBinding.inflate(inflater,container,false)
        binding.btnNewLogin.setOnClickListener {
            view:View ->Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_welcomeFragment)
        }
        binding.btnExistingAccount.setOnClickListener {
                view:View ->Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_welcomeFragment)
        }
        return binding.root

    }



            }

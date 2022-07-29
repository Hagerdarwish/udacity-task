package com.example.udacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.udacity.databinding.FragmentListBinding
import com.example.udacity.databinding.FragmentWelcomeBinding


class ListFragment : Fragment() {

        lateinit var binding: FragmentListBinding
        lateinit var viewmodel: shoeViewmodel

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentListBinding.inflate(inflater, container, false)
            binding.floatingActionButton.setOnClickListener {
                    view:View ->
                Navigation.findNavController(view).navigate(R.id.action_listFragment_to_detailFragment)
                viewmodel = ViewModelProvider(this).get(shoeViewmodel::class.java)//return to viewmodel


            }
            
            //viewModel.score.observe(this, Observer { newScore ->
            //    binding.scoreText.text = newScore.toString()
            //})
            return binding.root

        }
    }
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//    private lateinit var viewModel: MainActivityViewModel
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
//        binding.viewModel = viewModel
//        binding.lifecycleOwner = this
//    }
//}
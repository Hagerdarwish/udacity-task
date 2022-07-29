package com.example.udacity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class shoeViewmodel:ViewModel() {
    val shoe = MutableLiveData<String>()
}
package com.example.twowaydatabinding.viewmodel

import androidx.lifecycle.ViewModel
import com.example.twowaydatabinding.model.Cities
import com.example.twowaydatabinding.model.Gender
import com.example.twowaydatabinding.model.User

class MainViewModel : ViewModel(){

    val user = User("ali@email.com", "ali123", Gender.FEMALE, Cities.RAWALPINDI)
}
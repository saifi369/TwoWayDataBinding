package com.example.twowaydatabinding.model

data class User(
    var email: String,
    var username: String,
    var gender: Gender,
    var city: Cities
)  {

    override fun toString(): String {
        return "Email: $email\n" +
                "Username: $username\n" +
                "Gender: $gender\n" +
                "City: $city"
    }

}
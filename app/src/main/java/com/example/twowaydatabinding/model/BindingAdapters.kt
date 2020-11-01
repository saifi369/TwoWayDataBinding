@file:JvmName("BindingUtils")

package com.example.twowaydatabinding.model

import androidx.databinding.InverseMethod
import com.example.twowaydatabinding.R

//used for infinite loop problem and its solution

//@BindingAdapter("android:text")
//fun setText(view:EditText,value:String){
//    Log.d("MyTag", "setText: called for $value")
//    if(value != view.text.toString())
//        view.setText(value)
//}

@InverseMethod("buttonIdToGender")
fun genderToButtonId(gender: Gender): Int {
    return if (gender == Gender.MALE) R.id.rb_male else R.id.rb_female
}

fun buttonIdToGender(buttonId: Int): Gender {
    return if (buttonId == R.id.rb_male) Gender.MALE else Gender.FEMALE
}

@InverseMethod("positionToCity")
fun cityToPosition(city: Cities): Int {
    return city.ordinal
}

fun positionToCity(position: Int): Cities {
    return Cities.values()[position]
}
package com.example.twowaydatabinding

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.databinding.*
import com.example.twowaydatabinding.model.Cities

const val TAG = "MyTag"

@BindingMethods(
        BindingMethod(type = MySpinner::class, attribute = "city", method = "setSelectedCity"),
        BindingMethod(type = MySpinner::class, attribute = "cityAttrChanged", method = "setBindingListener")
)

@InverseBindingMethods(
        InverseBindingMethod(type = MySpinner::class, attribute = "city", method = "getSelectedCity")
)

class MySpinner : androidx.appcompat.widget.AppCompatSpinner {

    private lateinit var inverseBindingListener: InverseBindingListener

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {

        onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                inverseBindingListener.onChange()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

    }

    fun setSelectedCity(city: Cities) {
        Log.d(TAG, "setSelectedCity: called")
        setSelection(city.ordinal)
    }

    fun getSelectedCity(): Cities {
        Log.d(TAG, "getSelectedCity: called")
        return Cities.values()[selectedItemPosition]
    }

    fun setBindingListener(listener: InverseBindingListener) {
        Log.d(TAG, "setBindingListener: called")
        this.inverseBindingListener = listener
    }
}
package com.sriv.shivam.countrycodepicker

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.hbb20.CountryCodePicker

class MainActivity : AppCompatActivity() {
    lateinit var ccp: CountryCodePicker
    lateinit var editTextPhone: EditText
    lateinit var show_toast_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ccp = findViewById(R.id.country_code_picker)
        editTextPhone = findViewById(R.id.editTextPhone)
        show_toast_button = findViewById(R.id.show_toast_button)

        show_toast_button.setOnClickListener {
            val code = ccp.selectedCountryCode
            val country = ccp.selectedCountryName
            val number = editTextPhone.text.toString()

            val text = "Country: $country, Code: $code, Number: $number"

            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        }
    }
}
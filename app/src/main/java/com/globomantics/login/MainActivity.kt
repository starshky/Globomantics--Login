package com.globomantics.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var email: EditText

    private lateinit var password: EditText
    private lateinit var login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextEmail)
        password = findViewById(R.id.editText2Password)
        login = findViewById(R.id.buttonLogin)

        login.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Toast.makeText(this,  text): "Login", Toast.LENGTH_SHORT).show()
    }
}







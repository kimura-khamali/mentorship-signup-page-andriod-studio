package com.akirachix.mentorconnect

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorconnect.databinding.ActivityLoginactivityBinding
import com.akirachix.mentorconnect.databinding.ActivityMainBinding

class loginactivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginactivityBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.sign.setOnClickListener {
//            startActivity(Intent(this,MainActivity::class.java))
//        }
        super.onCreate(savedInstanceState)
        binding = ActivityLoginactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sign.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            validateRegistration()
        }
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_loginactivity)
//        val sign=findViewById<TextView>(R.id.sign)
//        sign.setOnClickListener{
//            val intent= Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//       }
    }

    fun validateRegistration() {
        var formErr = false
//        clearErrors()
        val firstName = binding.etuserlogin.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tiluserlogin.error = "User Name is required"
        }

        val lastName = binding.etpasswordlogin.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tilpasswordlogin.error = "Last name is required"
        }
        }
    fun clearError() {
        
    }
}
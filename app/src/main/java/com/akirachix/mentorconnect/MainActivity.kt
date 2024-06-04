package com.akirachix.mentorconnect

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    //    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.log.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
        }
        binding.btnNext.setOnClickListener {
            validateRegistration()
        }

//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        val log = findViewById<TextView>(R.id.log)
//        log.setOnClickListener {
//            val intent = Intent(this, loginactivity::class.java)
//            startActivity(intent)
//        }

    }

    fun validateRegistration() {
        var formErr = false
//        var clearErrors =
        val firstName = binding.etfirstname.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tifirstname.error = "First name is required"
        }

        val lastName = binding.etlastname.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tilastname.error = "Last name is required"
        }
        val email = binding.etemail.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tifirstname.error = "Email  is required"
        }
        val codehiveid = binding.etid.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tifirstname.error = "Codehive ID is required"
        }
        val username = binding.etusername.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tifirstname.error = "Username is required"
        }
        val password = binding.etconpassword.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tipassword.error = "Password is required"
        }
        val passwordConf = binding.etconpassword.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tipassword.error = "Password is required"
        }
        if (password != passwordConf) {
            formErr = true
            binding.ticonpassword.error = "Password don't match"
    }
        if (!formErr) {
            //proceed to registration
        }
}
//    fun clearErrors(){
//        binding.tifirstname.error = null
//        binding.tilastname.error = null
//        binding.etemail.error = null
////        binding.ticonpassword = null
//        binding.
//    }
}
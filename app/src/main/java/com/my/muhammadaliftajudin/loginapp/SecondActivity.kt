package com.my.muhammadaliftajudin.loginapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.my.muhammadaliftajudin.loginapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val username = bundle.getString("Username")
        val password = bundle.getString("Password")

        binding.usernameTextView.text = "Username: $username"
        binding.passwordTextView.text = "Password: $password"
    }
}
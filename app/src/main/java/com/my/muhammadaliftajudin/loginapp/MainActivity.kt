package com.my.muhammadaliftajudin.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.my.muhammadaliftajudin.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBtn.setOnClickListener {
            val intent = Intent("com.my.muhammadaliftajudin.LoginApp")
            intent.putExtra("Username", binding.usernameEditText.text.toString())
            intent.putExtra("Password", binding.passwordEditText.text.toString())
            intent.setClassName("com.my.muhammadaliftajudin.loginapp",
                "com.my.muhammadaliftajudin.loginapp.SecondActivity")
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            startActivity(intent)
        }
    }
}
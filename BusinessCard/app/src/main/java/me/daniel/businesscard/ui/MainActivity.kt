package me.daniel.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.daniel.businesscard.R
import me.daniel.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
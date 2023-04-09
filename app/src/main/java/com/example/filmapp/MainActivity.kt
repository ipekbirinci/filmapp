package com.example.filmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myTextView = binding.deneme
        myTextView.text="Selam"
        val filmOne=FilmData("The Lobster",2012,"klasik")
        val filmTwo=FilmData("John Wick",2014,"url")
    }

}
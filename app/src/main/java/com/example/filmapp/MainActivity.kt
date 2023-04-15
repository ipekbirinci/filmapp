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

        val myTextView = binding.movieid
        val filmOne=FilmData("Naruto",2012,"klasik")
        myTextView.text=filmOne.name;
        val filmTwo=FilmData("John Wick",2014,"url")
    }

}
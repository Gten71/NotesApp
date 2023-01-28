package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notesapp.databinding.ActivityQuestionPageBinding

class QuestionPage : AppCompatActivity() {
    private lateinit var binding : ActivityQuestionPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBackiArrow.setOnClickListener{
            onBackPressed()
        }
    }
}
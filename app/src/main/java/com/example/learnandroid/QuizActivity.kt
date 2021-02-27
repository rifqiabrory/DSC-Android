package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class QuizActivity : AppCompatActivity() {

    lateinit var nameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        nameTextView = findViewById(R.id.nameId)
        nameTextView.text = intent.extras?.get("name").toString()
    }
}

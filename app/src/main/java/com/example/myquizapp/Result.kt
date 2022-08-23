package com.example.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestion = intent.getIntArrayExtra(Constants.TOTAL_QUESTIONS)
        val score = intent.getIntArrayExtra(Constants.CORRECT_ANSWERS)
        tvScore.text = "You get ${score} right out of ${totalQuestion}"

    }
}
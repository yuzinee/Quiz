package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tv_name: TextView = findViewById(R.id.tv_name)
        val tv_score: TextView = findViewById(R.id.tv_score)
        val btn_end: Button = findViewById(R.id.btn_end)

        val user_name = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = user_name

        val total_questions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correct_answers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "정답 개수 $correct_answers / $total_questions"

        btn_end.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
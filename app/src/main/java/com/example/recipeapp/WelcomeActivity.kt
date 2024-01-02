package com.example.recipeapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Example button click to navigate to Explore Page
        btnExplore.setOnClickListener {
            startActivity(Intent(this, ExploreActivity::class.java))
        }
    }
}

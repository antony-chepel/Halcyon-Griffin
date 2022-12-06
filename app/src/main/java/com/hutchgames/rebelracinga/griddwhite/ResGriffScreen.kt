package com.hutchgames.rebelracinga.griddwhite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hutchgames.rebelracinga.databinding.ActivityResGriffScreenBinding
import kotlin.random.Random

class ResGriffScreen : AppCompatActivity() {
    private lateinit var hshaddjjsd : ActivityResGriffScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hshaddjjsd = ActivityResGriffScreenBinding.inflate(layoutInflater)
        setContentView(hshaddjjsd.root)
        hshaddjjsd.kfdlsflsdfl.text = GriffUtils.listPointsGriff[Random.nextInt(4)]
        hshaddjjsd.nsamdmasjdjs.setOnClickListener {
            startActivity(Intent(this,MainGriffScreen::class.java ))
        }
    }
}
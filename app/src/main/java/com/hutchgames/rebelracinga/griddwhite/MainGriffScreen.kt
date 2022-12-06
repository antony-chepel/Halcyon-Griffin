package com.hutchgames.rebelracinga.griddwhite

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.hutchgames.rebelracinga.R
import com.hutchgames.rebelracinga.databinding.ActivityMainGriffScreenBinding

class MainGriffScreen : AppCompatActivity() {
    private lateinit var jakdaskdkaskd : ActivityMainGriffScreenBinding
    private var statdtyasdhasjdj: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jakdaskdkaskd = ActivityMainGriffScreenBinding.inflate(layoutInflater)
        setContentView(jakdaskdkaskd.root)
        xbzncxlkcskadkkasdkasd()

        jakdaskdkaskd.imageView.setOnClickListener {
            jakdaskdkaskd.imageView.visibility = View.GONE
        }
        jakdaskdkaskd.imageView4.setOnClickListener {
            jakdaskdkaskd.imageView4.visibility = View.GONE
        }

        jakdaskdkaskd.ydwqdyuqwduqwud.setOnClickListener {
            startActivity(
                Intent(this@MainGriffScreen,ResGriffScreen::class.java)
            )
        }
    }


    private fun xbzncxlkcskadkkasdkasd() =with(jakdaskdkaskd){
        var rsdewrqdwq = 15
        statdtyasdhasjdj?.cancel()
        statdtyasdhasjdj = object : CountDownTimer(15000,1000){
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                rsdewrqdwq--
                if(rsdewrqdwq >= 0) {
                    val skadkalsdsl = rsdewrqdwq.toString()
                    jsjjdsjajdjasd.text = "Time : $skadkalsdsl sec"

                    when(rsdewrqdwq){
                        3-> jsjjdsjajdjasd.setTextColor(resources.getColor(R.color.griff_error))
                        2-> jsjjdsjajdjasd.setTextColor(resources.getColor(R.color.griff_error))
                        1-> jsjjdsjajdjasd.setTextColor(resources.getColor(R.color.griff_error))
                        0-> jsjjdsjajdjasd.setTextColor(resources.getColor(R.color.griff_error))
                    }
                }
            }

            override fun onFinish() {
                jsjjdsjajdjasd.setTextColor(resources.getColor(R.color.white))
                if(rsdewrqdwq==0){
                    rsdewrqdwq = 10
                    startActivity(
                        Intent(this@MainGriffScreen,ResGriffScreen::class.java)
                    )
                }


            }

        }.start()
    }
}
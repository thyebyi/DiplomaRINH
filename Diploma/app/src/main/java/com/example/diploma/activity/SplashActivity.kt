package com.example.diploma.activity

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class SplashActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var animation: Animation
    private lateinit var progressBar: ProgressBar
    private lateinit var layout: ConstraintLayout
    private val SPLASH_DURATION: Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.diploma.R.layout.activity_splash)
        progressBar = findViewById(com.example.diploma.R.id.progressBar)
        layout = findViewById(com.example.diploma.R.id.splashLayout)
        imageView = findViewById(com.example.diploma.R.id.imageView)
        animation = AnimationUtils.loadAnimation(baseContext, com.example.diploma.R.anim.rotate)

    }

    //    private fun initFunc()
//    {
//        layout.postDelayed(Runnable {
//            override fun run(){
//                progressBar.visibility = View.GONE
//                imageView.startAnimation(animation)
//                animation.setAnimationListener(Animation.AnimationListener(an){
//
//                })
//            }
//        })
//    }
    private fun initFunctionality() {
        layout.postDelayed(Runnable {
            progressBar.visibility = View.GONE
            imageView.startAnimation(animation)
            animation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {

                }

                override fun onAnimationEnd(animation: Animation) {
//                ActivityUtilities.getInstance()
//                    .invokeNewActivity(this@SplashActivity, MainActivity::class.java, true)

                }

                override fun onAnimationRepeat(animation: Animation) {

                }
            })
        }, SPLASH_DURATION)
    }

    override fun onResume() {
        super.onResume()
        initFunctionality()
    }
}

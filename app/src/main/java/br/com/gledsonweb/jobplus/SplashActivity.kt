package br.com.gledsonweb.jobplus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        load()
    }

    fun load() {
        val anim: Animation = AnimationUtils.loadAnimation(this, R.anim.splash)

        anim.reset()

        if(ivLogo != null) {
            ivLogo.clearAnimation()
            ivLogo.startAnimation(anim)
        }

        Handler().postDelayed(Runnable {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            this@SplashActivity.finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())

    }
}

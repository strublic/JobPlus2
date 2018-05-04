package br.com.gledsonweb.jobplus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.annotation.NonNull
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener{
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}

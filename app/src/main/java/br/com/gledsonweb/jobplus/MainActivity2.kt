package br.com.gledsonweb.jobplus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.annotation.NonNull
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction

class MainActivity2 : AppCompatActivity(){

    lateinit var bnv : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bnv = findViewById(R.id.navigation)
        bnv.setOnNavigationItemSelectedListener(object : BottomNavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                var selectedFragment: Fragment? = null
                when (item.itemId)
                {
                    R.id.action_list ->
                        selectedFragment = ListJobFragment.newInstance()

                    R.id.action_perfil ->
                        selectedFragment = MyPerfilFragment.newInstance()
                }

                var ft: FragmentTransaction = supportFragmentManager.beginTransaction()
                ft.replace(R.id.frame_layout, selectedFragment)
                ft.commit()
                return true
            }
        })
        var ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.frame_layout, ListJobFragment.newInstance())
        ft.commit()

    }

}
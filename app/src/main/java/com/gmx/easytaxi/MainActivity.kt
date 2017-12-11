package com.gmx.easytaxi

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(android.os.Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            val anim: AnimatedVectorDrawable? =
                    resources.getDrawable(R.drawable.anim) as AnimatedVectorDrawable
            iv_logo.setImageDrawable(anim)
            anim?.start()
        }

    }
}

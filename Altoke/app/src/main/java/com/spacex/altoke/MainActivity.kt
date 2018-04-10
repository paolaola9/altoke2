package com.spacex.altoke

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    button12.setOnClickListener(){
        var intent  = Intent(this,HOME::class.java)

                startActivity(intent)

        Toast.makeText(this, "hola mundo",Toast.LENGTH_SHORT).show()

        }
    }

}

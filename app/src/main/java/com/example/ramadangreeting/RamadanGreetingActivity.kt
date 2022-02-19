package com.example.ramadangreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RamadanGreetingActivity : AppCompatActivity() {

    companion object{

        const val NAME_EXTRA="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramadan_greeting)

        val receive=intent.getStringExtra(NAME_EXTRA)

        val ramadanGreeting=findViewById<TextView>(R.id.ramadanGreetingId)
        //ramadanGreeting.setText(receive)
        ramadanGreeting.text="Ramadan Mubarak\n$receive"
    }
}


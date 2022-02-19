package com.example.ramadangreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.inputFieldId)
        val btn=findViewById<Button>(R.id.createButtonId)


        btn.setOnClickListener {

            val store=et.editableText.toString()
           // Toast.makeText(this, "Value =$store",Toast.LENGTH_LONG).show()
            val intent =Intent(this,RamadanGreetingActivity::class.java)
            intent.putExtra(RamadanGreetingActivity.NAME_EXTRA,store)
            startActivity(intent)

        }


    }

//    fun createCard(view: View) {
//
//
//        Toast.makeText(this," get:"+et.editableText.to,Toast.LENGTH_LONG).show()
//
//    }
}
package com.example.icetask2

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // get the button using the id we set on the user interface
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)

// get the text view and edit text
        val welcomeTextView =
            findViewById<TextView>(R.id.welcomeTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

// add code to the button that happens when it is clicked
        clickMeButton?.setOnClickListener {
            welcomeTextView.text = "Welcome, ${nameEditText.text}!"

            // add code to the button that happens when it is clicked
            clickMeButton?.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Button clicked", Toast.LENGTH_LONG
                ).show()

            }
        }
    }
}













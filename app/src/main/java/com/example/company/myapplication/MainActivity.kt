package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val buttonIntent = findViewById<Button>(R.id.button)
        buttonIntent.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            Log.d("Tag", "${editText.text}")
            intent.putExtra("text", editText.text.toString())
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        //editText.setText("")
        textView.text = data?.getStringExtra("text")


    }

}

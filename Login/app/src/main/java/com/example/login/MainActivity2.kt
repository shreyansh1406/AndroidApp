package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var res =  intent.extras!!.getString("key")
        textView.setText(res)

        button2.setOnClickListener {

            var myIntent= Intent(this,MainActivity::class.java)

            startActivity(myIntent)
}
}
}

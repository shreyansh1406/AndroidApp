package com.example.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      buttonClick.setOnClickListener {
          var un = editText.text.toString()
          var pass = editText2.text.toString()
          var uname:String? = "shrey"
          var password:String? = "123"

          if(un.equals(uname)  && pass.equals(password))
          {
              textview.setText(un)
              var intentHere = Intent(this,MainActivity2::class.java)
              intentHere.putExtra("key",un)
              startActivity(intentHere)
          }
          else
          {
              Toast.makeText(this, "Either Username or Passowrd is Wrong", Toast.LENGTH_LONG).show()
          }
       /*   Toast.makeText(this,"Hello $un",Toast.LENGTH_LONG).show()
          textview.setText(un)
          var myIntent=Intent(this,MainActivity2::class.java)
          startActivity(myIntent)*/
      }
    }


}
package com.urme.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         //oncreate method id work when the mainActivity Method is created

//        createBirthdayButton.setOnClickListener {
//
//               // //passing the some implementation of OnclickListener through lamda function
//        }
    }

    fun createBirthDayCard(view: View) {

//        val name = nameInput.editableText.toString();  //how its working?
//        //ans is : our name was in input that we extract and then put it into toast
//
//        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()

        val name = nameInput.editableText.toString()  //we need to pass this name into intent
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        //we need to pass two parameter in Intent constructor   ,one is the context of present activity and another is expected activity

        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)     //here "name" is the key value

        startActivity(intent)    //we getting this from appCompactActivity
        //intent is the way of getting one to another process and here our process is activity
    }

}
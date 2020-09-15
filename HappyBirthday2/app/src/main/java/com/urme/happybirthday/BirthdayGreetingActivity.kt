package com.urme.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    //lets make an companion object , that is basically like a static variable that we can use for different case
    //and we use this so that the name key of main class remain same in this class also
    companion object {
        const val  NAME_EXTRA = "name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA) // getting the key of string from mainActivity
        BirthdayGreetings.text = "Happy Birthday\n$name"

    }
}
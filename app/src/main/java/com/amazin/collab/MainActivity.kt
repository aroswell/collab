package com.amazin.collab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //my code is going here
        Toast.makeText(this, "Can you see me?", Toast.LENGTH_SHORT).show()
        //Log.i("info", "Done creating the app")
    }

    fun onClickingMyButton(v: View) {
        Toast.makeText(this, "Top button clicked", Toast.LENGTH_SHORT).show()
        //Log.i("info", "The user clicked the top button")
    }

}

package com.src.tools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.src.ncd.CountView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Call Lib
        val countView = CountView(
            this    // Add the Activity
            ,R.id.timerPosition,  // Layout must be Relative Layout ! as a Parent
            {Toast.makeText(this, "It's Finish", Toast.LENGTH_SHORT).show()} //Function after finish
            , null  // Function in Running time, Repeatedly !!!
            , "wooden"  // You can choose a theme or null
        )


        // When you call this method , the timer will start !

        // countView.startTimer(0, 20)


        countView.buttons(
            findViewById<Button>(R.id.stop), // Optional Button , For Stop the timer
            findViewById<Button>(R.id.pause))// Optional Button , For Pause the timer


        findViewById<Button>(R.id.start).setOnClickListener {
            // When you call this method , the timer will start !
            countView.startTimer(1, 20) // set time by Sec and Min

        }
    }
}
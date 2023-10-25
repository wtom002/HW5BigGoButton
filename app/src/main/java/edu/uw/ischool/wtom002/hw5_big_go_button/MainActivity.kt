package edu.uw.ischool.wtom002.hw5_big_go_button

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0 // Initialize count as a class variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_id)

        //button.text = "Click me"

        button.setOnClickListener {
            count++
            if (count == 1) {
                button.text = "You have pushed me $count time!"
            } else {
                button.text = "You have pushed me $count times!"
            }
        }
    }
}

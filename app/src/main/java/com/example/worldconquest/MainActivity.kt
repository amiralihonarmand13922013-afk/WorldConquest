package com.example.worldconquest

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(20, 30, 45))

        val title = TextView(this)
        title.text = "🌍 فتح جهان"
        title.textSize = 32f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val start = Button(this)
        start.text = "شروع بازی"
        layout.addView(start)

        val info = TextView(this)
        info.text = "بازی استراتژیک فتح کشورها"
        info.textSize = 20f
        info.setTextColor(Color.WHITE)
        info.gravity = Gravity.CENTER
        layout.addView(info)

        start.setOnClickListener {
            Toast.makeText(this, "بازی شروع شد!", Toast.LENGTH_LONG).show()
        }

        setContentView(layout)
    }
}

package com.example.menugo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView

class CreateAMenu : AppCompatActivity() {

    lateinit var calendarView: CalendarView
    //lateinit var dateView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_a_menu)
        title = "Kotlin"
        calendarView = findViewById(R.id.calendarView)
        //dateView = findViewById(R.id.dateView)
        /*calendarView.setOnDateChangeListener(OnDateChangeListener { _, year, month, dayOfMonth −>
            val date = dayOfMonth.toString() + "−" + (month + 1) + "−" + year
            dateView.text = date
        })*/
    }



}
package com.example.alarmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saveData= SaveData(applicationContext)
        tvShowTime.text=saveData.getHour().toString()+":"+saveData.getMinute().toString()
    }

    fun buSetTime(view: View) {

        val popTime = PopTime()
        val fm = supportFragmentManager
        popTime.show(fm, "select time")
    }

    fun setTime(Hours: Int, Minute: Int) {

        tvShowTime.text = Hours.toString() + ":" + Minute.toString()
        val saveData = SaveData(applicationContext)
        saveData.SaveData(Hours, Minute)

    }
}

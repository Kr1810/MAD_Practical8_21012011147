package com.example.mad_practical8_21012011147

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun setAlarm(millitime:Long,action:String){
        val intentAlarm=Intent(applicationContext,AlarmBroadcastReciever::class.java)
        intentAlarm.putExtra(AlarmBroadcastReciever.ALARM_KEY,action)
        val pendingIntent=PendingIntent.getBroadcast(applicationContext,2345,intentAlarm,PendingIntent.FLAG.)
        if (action==AlarmBroadcastReciever){

}
package com.example.mad_practical8_21012011147

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReciever : BroadcastReceiver() {
   companion object{
       val ALARM_KEY="weke up"
       val ALARM_STOP="stop"
       val ALARM_START="hello,weke up"
   }
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val data=intent.getStringExtra(ALARM_KEY)
        val intent_service=Intent(context,AlarmService::class.java)
        if (data == ALARM_START) {
        }
        context.startService(intent_service)
}

}
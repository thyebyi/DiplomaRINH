package com.example.diploma.utilities

import android.app.Activity
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import com.example.diploma.activity.MainActivity


class ActivityUtilities {
    private var activityUtilities: ActivityUtilities? = null

    fun getInstance(): ActivityUtilities {
       if (activityUtilities == null) {
          activityUtilities = ActivityUtilities()
       }
       return activityUtilities as ActivityUtilities
   }

    fun invokeNewActivity(activity : Activity, tClass : Class<MainActivity>,shouldFinish : Boolean) {
        val intent = Intent(activity, tClass)
        activity.startActivity(intent)
        if (shouldFinish) {
            activity.finish()
        }
    }
}
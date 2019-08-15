package com.lambdaschool.notificationdemocode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.notificationdemocode.util.NotificationGenerator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val NOTIFICATION_ID = 87
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*btn_notification_simple.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {

            }
        })*/

        btn_notification_simple.setOnClickListener { p0 ->
            NotificationGenerator.simpleNotification(this)
        }
    }


}

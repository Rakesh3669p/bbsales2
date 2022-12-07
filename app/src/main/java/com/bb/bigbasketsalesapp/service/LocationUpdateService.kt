package com.bb.bigbasketsalesapp.service

import android.app.*
import android.content.Intent
import android.os.Build
import android.os.IBinder
import androidx.annotation.Nullable
import androidx.annotation.RequiresApi
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.ui.MainActivity
import com.bb.bigbasketsalesapp.ui.MainActivity.Companion.mainHandler
import java.util.*


@RequiresApi(Build.VERSION_CODES.O)
class LocationUpdateService : Service() {
    val CHANNEL_ID = "BBSale_Location"
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        prepareForegroundNotification()
        return START_STICKY
    }


    private fun prepareForegroundNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                CHANNEL_ID,
                "Location Service Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            val manager: NotificationManager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(serviceChannel)
        }
        val notificationIntent = Intent(this, MainActivity::class.java)

        val pendingIntent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_MUTABLE)
        } else {
            PendingIntent.getActivity(this, 0, notificationIntent, 0)
        }

        val notification: Notification = Notification.Builder(this, CHANNEL_ID)
            .setContentTitle("BBSales")
            .setContentTitle("BBSales is accessing your Location!")
            .setSmallIcon(R.drawable.bg)
            .setCategory(Notification.CATEGORY_LOCATION_SHARING)
            .setContentIntent(pendingIntent)
            .build()
        startForeground(1, notification)
    }

    @Nullable
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        super.onTaskRemoved(rootIntent)
        if (mainHandler != null) {
            mainHandler?.removeCallbacksAndMessages(null)
        }
        stopSelf()
    }
}
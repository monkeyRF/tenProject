package com.example.tplesson412

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.Toast

class MediaService : Service() {

    override fun onBind(intent: Intent): IBinder? = null

    private lateinit var mPlayer: MediaPlayer

    override fun onCreate() {
        super.onCreate()

        mPlayer = MediaPlayer.create(this, R.raw.music)
        mPlayer.start()

        val text = "Включить трек"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        if (mPlayer.isPlaying) mPlayer.release()

        val text = "Выключили трек"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

}
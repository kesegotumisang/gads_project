package bw.impurefunctions.gadsleaderboard.models

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import bw.impurefunctions.gadsleaderboard.R

class SubmissionFailedDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submission_failed)
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val width = displayMetrics.widthPixels
        val height = displayMetrics.heightPixels
        window.setLayout((width * .9).toInt(), (height * .6).toInt())
    }
    companion object {
        private const val C_TIME_OUT = 1000
    }
}
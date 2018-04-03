package edu.rosehulman.fisherds.hellobutton

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increment_button.setOnClickListener {
            mCount++
            updateView()
        }

        decrement_button.setOnClickListener {
            mCount--
            updateView()
        }

        reset_button.setOnClickListener {
            mCount = 0
            updateView()
        }
    }

    private fun updateView() {
        message_text_view.text = getString(R.string.message_format, mCount)
        if (mCount > 10) {
            message_text_view.visibility = View.INVISIBLE
        } else {
            message_text_view.visibility = View.VISIBLE
        }
    }
}

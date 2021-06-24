package com.mindorks.framework.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    val box_one = findViewById<TextView>(R.id.box_one_text)
    val box_two = findViewById<TextView>(R.id.box_two_text)
    val box_three = findViewById<TextView>(R.id.box_three_text)
    val box_four = findViewById<TextView>(R.id.box_four_text)
    val box_five = findViewById<TextView>(R.id.box_five_text)
    val constraintlayout = findViewById<ConstraintLayout>(R.id.constraint_layout)
    val red = findViewById<Button>(R.id.red_button)
    val yellow = findViewById<Button>(R.id.yellow_button)
    val green = findViewById<Button>(R.id.green_button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()

    }

    fun setListeners(){
        val clickableViews = listOf<View>(box_one,box_two,box_three,box_four,box_five,constraintlayout,red,yellow,green)

        for (item in clickableViews){
            item.setOnClickListener { makecoloredboxes(it) }
        }
    }

    private fun makecoloredboxes(view: View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text ->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text ->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text ->view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_three.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
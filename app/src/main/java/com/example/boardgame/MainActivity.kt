package com.example.boardgame

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val buttons: ArrayList<Button>? = arrayListOf()
    private var tempButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addElements()
        addListeners()

    }

    private fun addListeners() {
        for (button: Button in this!!.buttons!!) {
            button.setOnClickListener(this)
        }
    }

    private fun addElements() {
        buttons!!.add(btn1)
        buttons!!.add(btn2)
        buttons!!.add(btn3)
        buttons!!.add(btn4)
        buttons!!.add(btn5)
        buttons!!.add(btn6)
        buttons!!.add(btn7)
        buttons!!.add(btn8)
        buttons!!.add(btn9)
        buttons!!.add(btn10)
        buttons!!.add(btn11)
        buttons!!.add(btn12)
        buttons!!.add(btn13)
        buttons!!.add(btn14)
        buttons!!.add(btn15)
        buttons!!.add(btn16)
        buttons!!.add(btn17)
        buttons!!.add(btn18)
        buttons!!.add(btn19)
        buttons!!.add(btn20)
        buttons!!.add(btn21)
        buttons!!.add(btn22)
    }

    override fun onClick(v: View?) {
        var btn: Button = v as Button
        if (!btn.text.equals("z") && !btn.text.equals("")) {
            if (tempButton != null) {
                tempButton = null
            } else {
                tempButton = btn
            }
        } else if (tempButton != null && (btn.text.equals("z") || btn.text.equals("")) && !btn.text.equals(tempButton!!.text)) {

            var textTemp1: String = btn.text as String
            var textTemp2: String = tempButton!!.text as String

            if (btn.text.equals("z") && tempButton!!.text.equals("b")) {
                textTemp2 = btn.text as String
                textTemp1 = ""
            }

            var btTemp: Button = btn;
            btn.text = textTemp2
            tempButton!!.text = textTemp1

            tempButton = null
            checkGameOver()

        }
    }

    private fun checkGameOver() {
        var flag: Boolean = false

        when ("b") {
            btn1.text.toString() -> flag = true
            btn2.text.toString() -> flag = true
            btn3.text.toString() -> flag = true
            btn4.text.toString() -> flag = true
            btn5.text.toString() -> flag = true
            btn6.text.toString() -> flag = true
            btn7.text.toString() -> flag = true
            btn8.text.toString() -> flag = true
            btn9.text.toString() -> flag = true
            btn10.text.toString() -> flag = true
            btn11.text.toString() -> flag = true
            btn12.text.toString() -> flag = true
            btn13.text.toString() -> flag = true
            btn14.text.toString() -> flag = true
            btn15.text.toString() -> flag = true
            btn16.text.toString() -> flag = true
            btn17.text.toString() -> flag = true
            btn18.text.toString() -> flag = true
            btn19.text.toString() -> flag = true
            btn20.text.toString() -> flag = true
            btn21.text.toString() -> flag = true
            btn22.text.toString() -> flag = true
        }

        if (!flag) {
            displayDialog()
        }
    }

    private fun displayDialog() {
        val builder = AlertDialog.Builder(MainActivity@ this, android.R.style.ThemeOverlay_Material_Dialog_Alert)
        builder.setTitle(getString(com.example.boardgame.R.string.exit_game))
        builder.setMessage(getString(com.example.boardgame.R.string.exit_game_description))
        val positiveText = getString(android.R.string.ok)
        builder.setPositiveButton(positiveText
        ) { dialog, which ->
            dialog.dismiss()
            MainActivity@ this.finish()
        }
        val dialog = builder.create()
// display dialog
        dialog.show()
    }
}

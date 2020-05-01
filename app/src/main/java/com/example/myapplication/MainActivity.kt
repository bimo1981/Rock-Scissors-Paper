package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener { (setTextFileds("0")) }
        btn_1.setOnClickListener { (setTextFileds("1")) }
        btn_2.setOnClickListener { (setTextFileds("2")) }
        btn_3.setOnClickListener { (setTextFileds("3")) }
        btn_4.setOnClickListener { (setTextFileds("4")) }
        btn_5.setOnClickListener { (setTextFileds("5")) }
        btn_6.setOnClickListener { (setTextFileds("6")) }
        btn_7.setOnClickListener { (setTextFileds("7")) }
        btn_8.setOnClickListener { (setTextFileds("8")) }
        btn_9.setOnClickListener { (setTextFileds("9")) }

        btn_ac.setOnClickListener {
            math_operation.text = ""
            result_text.text = ""
        }
        btn1_bracket.setOnClickListener { (setTextFileds("(")) }
        btn2_bracket.setOnClickListener { (setTextFileds(")")) }
        btn_slash.setOnClickListener { (setTextFileds("/")) }
        btn_mult.setOnClickListener { (setTextFileds("*")) }
        btn_plus.setOnClickListener { (setTextFileds("+")) }
        btn_minus.setOnClickListener { (setTextFileds("-")) }
        btn_equal.setOnClickListener { (setTextFileds("=")) }

    }

    fun setTextFileds(str: String){
        math_operation.append(str);
    }

}

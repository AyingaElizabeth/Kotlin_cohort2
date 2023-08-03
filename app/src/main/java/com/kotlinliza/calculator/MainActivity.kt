package com.kotlinliza.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstnumber=findViewById<EditText>(R.id.val1)
        val secondnumber=findViewById<EditText>(R.id.val2)
        val addbtn=findViewById<Button>(R.id.button)
        val subbtn=findViewById<Button>(R.id.subBtn)
        val divbtn=findViewById<Button>(R.id.divBtn)
        val result=findViewById<TextView>(R.id.answer)
        val multBtn=findViewById<Button>(R.id.mulBtn)


       addbtn.setOnClickListener {
           calc("+")
       }
    subbtn.setOnClickListener {
        calc("-")
    }
        divbtn.setOnClickListener {
            calc("/")
        }
     multBtn.setOnClickListener {
         calc("*")
     }




}

    private fun calc(operator: String) {
        val firstnumber=findViewById<EditText>(R.id.val1)
        val secondnumber=findViewById<EditText>(R.id.val2)
        val result=findViewById<TextView>(R.id.answer)


            val firstVal = firstnumber.text.toString().toInt()
            val secondval = secondnumber.text.toString().toInt()

            if(firstVal==null&&secondval==null){
                result.text="invalid"
                return
            }
            val ans=when(operator){
                "+"->firstVal+secondval
                "-"->firstVal-secondval
                "/"->firstVal/secondval
                "*"->firstVal*secondval



                else->{
                    result.text="invalid inout"
                    return
                }
            }


            result.text = "Result=$ans is your answer "

        }

    }

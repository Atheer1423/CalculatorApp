package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.convertTo

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var b7:Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var bd: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var bx: Button
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var bs: Button
    lateinit var bm: Button
    lateinit var b0: Button
    lateinit var bdot: Button
    lateinit var bsum: Button
    lateinit var bdel: Button
    lateinit var bc: Button
    lateinit var beq: Button
    var result=" "
    var oper=" "
    var minus=false
    var second=0
    var first=0
    var number1=" "
    var number2=" "
    lateinit var restornum:String

     var num1=false
     var num2=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)
        b7=findViewById(R.id.b7)
        b8=findViewById(R.id.b8)
        b9=findViewById(R.id.b9)
        b1=findViewById(R.id.b1)
        b2=findViewById(R.id.b2)
        b3=findViewById(R.id.b3)
        b4=findViewById(R.id.b4)
        b5=findViewById(R.id.b5)
        b6=findViewById(R.id.b6)
        bs=findViewById(R.id.bs)
        bm=findViewById(R.id.bm)
        beq=findViewById(R.id.beq)
        bc=findViewById(R.id.bc)
        bdot=findViewById(R.id.bdot)
        bsum=findViewById(R.id.bsum)
        bdel=findViewById(R.id.bdel)
        b0=findViewById(R.id.b0)
        bd=findViewById(R.id.bd)
        bx=findViewById(R.id.bx)

            var a = savedInstanceState?.getString("result")
            var b = savedInstanceState?.getString("solution")
            tv.text=b


        b7.setOnClickListener{
         result+="7"

           tv.text= result
            if(oper==" "){
                number1+="7"

            }else {
                number2 += "7"
            }
        }
        b8.setOnClickListener{
            result+= "8"

            tv.text= result
            if(oper==" "){
                number1+="8"

            }else {
                number2 += "8"
            }
        }
        b9.setOnClickListener{
            result+= "9"

            tv.text= result
            if(oper==" "){
                number1+="9"

            }else {
                number2 += "9"
            }
        }
        b1.setOnClickListener{
            result+= "1"

            tv.text= result
            if(oper==" "){
                number1+="1"

            }else {
                number2 += "1"
            }
        }
        b2.setOnClickListener{
            result+= "2"

            tv.text= result
            if(oper==" "){
                number1+="2"

            }else {
                number2 += "2"
            }
        }
        b3.setOnClickListener{
            result+= "3"

            tv.text= result
            if(oper==" "){
                number1+="3"

            }else {
                number2 += "3"
            }
        }
        b4.setOnClickListener{
            result+= "4"

            tv.text= result
            if(oper==" "){
                number1+="4"

            }else {
                number2 += "4"
            }
        }
        b5.setOnClickListener{
            result+= "5"

            tv.text= result
            if(oper==" "){
                number1+="5"

            }else {
                number2 += "5"
            }
        }
        b6.setOnClickListener{
            result+= "6"

            tv.text= result
            if(oper==" "){
                number1+="6"

            }else {
                number2 += "6"
            }
        }
        bs.setOnClickListener{
            result+= bs.text.toString()
            tv.text= result
            oper="-"


        }
        bx.setOnClickListener{
            result+= "*"
            tv.text= result
            oper="*"


        }
        bm.setOnClickListener{
            result+= "-"
            tv.text= result

            minus=true
            if(oper==" "){
                first=1;
            }else{
                second=1
            }

        }
        beq.setOnClickListener{

            if(number2.toFloat()==0f){
                tv.text="error"
            }else{
            var numbber1=number1.toFloat()
            var numbber2=number2.toFloat()

            if(minus==true){
               if (second==1&& first==1){
                 when(oper){
                     "+" -> tv.text=((-1*numbber1) + (-1*numbber2)).toString()
                     "/" ->  tv.text=((-1*numbber1) / (-1*numbber2)).toString()

                     "-" -> tv.text=((-1*numbber1) - (-1*numbber2)).toString()
                     "*" -> tv.text=((-1*numbber1) * (-1*numbber2)).toString()
                  }
               }else if(second==1){
                   when(oper){
                       "+" -> tv.text=(numbber1 + (-1*numbber2)).toString()
                       "/" ->tv.text=((1*numbber1) / (-1*numbber2)).toString()
                       "-" -> tv.text=(numbber1 - (-1*numbber2)).toString()
                       "*" -> tv.text=(numbber1 * (-1*numbber2)).toString()
                   }
               }else{
                   when(oper){
                       "+" -> tv.text=((-1*numbber1) + numbber2).toString()
                       "/" ->tv.text=((-1*numbber1) / (1*numbber2)).toString()

                       "-" -> tv.text=((-1*numbber1) - numbber2).toString()
                       "*" -> tv.text=((-1*numbber1) * numbber2).toString()
                   }

               }

            }else{
         when(oper){

             "+" -> tv.text=(numbber1 + numbber2).toString()
             "/" -> tv.text=(numbber1 / numbber2).toString()
             "-" -> tv.text=(numbber1 - numbber2).toString()
             "*" -> tv.text=(numbber1 * numbber2).toString()
         }}
        }}
        bsum.setOnClickListener{
            result+= "+"
            tv.text= result
            oper="+"

        }

        bd.setOnClickListener{
            result+= "/"
            tv.text= result
            oper="/"

        }
        b0.setOnClickListener{
            result+= "0"
            tv.text= result

            if(oper==" "){
                number1+="0"

            }else {
                number2 += "0"
            }
        }
        bc.setOnClickListener{
           recreate()
            result=" "
            tv.text=result
        }
        bdot.setOnClickListener{
            result+= "."
            tv.text= result

            if(oper==" "){
                number1+="."

            }else {
                number2 += "."
            }
        }
        bdel.setOnClickListener{

            result=result.dropLast(1)


               tv.text=result
               if(number2!=" "){
                  number2= number2.dropLast(1)
               }else if(oper!=" "){
                   oper=" "

               }else{
                   number1=number1.dropLast(1)
               }
           }



        }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("result", result)
        outState.putString("solution", tv.text.toString())

    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        restornum= savedInstanceState.getString("result","0")
        restornum= savedInstanceState.getString("solution","0")

    }






}

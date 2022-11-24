package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        butonsAddInput();
    }

    private fun butonsAddInput() {
        val numberInput : EditText = findViewById(R.id.numbersInput);
        val butoni0 : Button = findViewById(R.id.butoni0);
        val butoni1 : Button = findViewById(R.id.butoni1);
        val butoni2 : Button = findViewById(R.id.butoni2);
        val butoni3 : Button = findViewById(R.id.butoni3);
        val butoni4 : Button = findViewById(R.id.butoni4);
        val butoni5 : Button = findViewById(R.id.butoni5);
        val butoni6 : Button = findViewById(R.id.butoni6);
        val butoni7 : Button = findViewById(R.id.butoni7);
        val butoni8 : Button = findViewById(R.id.butoni8);
        val butoni9 : Button = findViewById(R.id.butoni9);
        val butoniPlus : Button = findViewById(R.id.butoniPlus);
        val butoniMinus : Button = findViewById(R.id.butoniMinus);
        val butoniShumezim : Button = findViewById(R.id.butoniShumezim);
        val butonioPjestim : Button = findViewById(R.id.butoniPjestim);
        val butoniPike : Button = findViewById(R.id.butoniPike);
        val butoniC : Button = findViewById(R.id.butoniC);
        val butoniCalculate :Button = findViewById(R.id.kalkulo)

        var stringi = "";


        butoni0.setOnClickListener{
            stringi += "0";
            numberInput.setText("${stringi}")
        }

        butoni1.setOnClickListener{
            stringi+="1"
            numberInput.setText("${stringi}")
        }
        butoni2.setOnClickListener{
            stringi+="2"
            numberInput.setText("${stringi}")
        }
        butoni3.setOnClickListener{
            stringi+="3"
            numberInput.setText("${stringi}")
        }
        butoni4.setOnClickListener{
            stringi+="4"
            numberInput.setText("${stringi}")
        }
        butoni5.setOnClickListener{
            stringi+="5"
            numberInput.setText("${stringi}")
        }
        butoni6.setOnClickListener{
            stringi+="6"
            numberInput.setText("${stringi}")
        }
        butoni7.setOnClickListener{
            stringi+="7"
            numberInput.setText("${stringi}")
        }
        butoni8.setOnClickListener{
            stringi+="8"
            numberInput.setText("${stringi}")
        }
        butoni9.setOnClickListener{
            stringi+="9"
            numberInput.setText("${stringi}")
        }
        butoniC.setOnClickListener{

            numberInput.setText("");
            stringi="";
        }
        butoniPike.setOnClickListener {
            stringi+="."
            numberInput.setText("${stringi}")
        }

        butoniPlus.setOnClickListener {
            if(!(stringi.contains("+")||stringi.contains("-") ||stringi.contains("*")||stringi.contains("/"))){
                stringi+="+"
                numberInput.setText("${stringi}")
            }


        }
        butoniMinus.setOnClickListener {
            if(!(stringi.contains("+")||stringi.contains("-") ||stringi.contains("*")||stringi.contains("/"))){
                stringi+="-"
                numberInput.setText("${stringi}")}

        }
        butoniShumezim.setOnClickListener {
            if(!(stringi.contains("+")||stringi.contains("-") ||stringi.contains("*")||stringi.contains("/"))){
                stringi+="*"
                numberInput.setText("${stringi}")
            }


        }
        butonioPjestim.setOnClickListener {
            if(!(stringi.contains("+")||stringi.contains("-") ||stringi.contains("*")||stringi.contains("/"))){
                stringi+="/"
                numberInput.setText("${stringi}")}

        }
        butoniCalculate.setOnClickListener {
            if(stringi.contains("+")){
                val numri =stringi.split("+")
                val mbledhja = numri[0].toDoubleOrNull()?.plus(numri[1].toDoubleOrNull()!!);
                numberInput.setText("${mbledhja}")
            }
            else if(stringi.contains("-")){
                val numri = stringi.split("-")
                val zbritja= numri[0].toDoubleOrNull()?.minus(numri[1].toDoubleOrNull()!!);
                numberInput.setText("${zbritja}")
            }
            else if(stringi.contains("*")){
                val numri = stringi.split("*")
                val shumzimi= numri[0].toDoubleOrNull()?.times(numri[1].toDoubleOrNull()!!);
                numberInput.setText("${shumzimi}")
            }
            else if(stringi.contains("/")){
                val numri = stringi.split("/")
                val pjestimi = numri[0].toDoubleOrNull()?.div( numri[1].toDoubleOrNull()!!);
                numberInput.setText("${pjestimi}")
            }
            stringi=""



        }




    }




}

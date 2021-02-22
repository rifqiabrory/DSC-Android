package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    var incrementValue = 0;
//    lateinit var incrementTextView: TextView;
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        incrementTextView = findViewById(R.id.counterTextView);
//    }
//
//    fun incrementCount(view: View){
//        var value = (++incrementValue).toString();
//        incrementTextView.text = value;
//        Log.i("Learn Android", "Increment value"+ value);
//    }

    lateinit var numberOneEditText: EditText;
    lateinit var numberTwoEditText: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOneEditText = findViewById(R.id.numberOne)
        numberTwoEditText = findViewById(R.id.numberTwo)
    }

    fun calculate(view: View) {
        var numberOne: Int? = numberOneEditText.text.toString().toIntOrNull()
        var numberTwo: Int? = numberTwoEditText.text.toString().toIntOrNull()
        if(numberOne === null || numberTwo === null) {
            Toast.makeText(this, "Both number should be integer", Toast.LENGTH_SHORT).show()
            return
        }
        Toast.makeText(this, "Result :: ${numberOne + numberTwo}", Toast.LENGTH_LONG).show()
    }

}
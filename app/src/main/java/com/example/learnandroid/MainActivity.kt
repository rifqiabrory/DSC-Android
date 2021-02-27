package com.example.learnandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

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

//    lateinit var numberOneEditText: EditText;
//    lateinit var numberTwoEditText: EditText;

    lateinit var sampleButton: Button
    lateinit var sendButton: Button
    lateinit var textInputName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        numberOneEditText = findViewById(R.id.numberOne)
//        numberTwoEditText = findViewById(R.id.numberTwo)
        sampleButton = findViewById(R.id.sampleButton)
        sendButton = findViewById(R.id.sendButton)
        textInputName = findViewById(R.id.textInputName)

        // using eventListener
        sampleButton.setOnClickListener(this)
        sendButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.sampleButton -> Toast.makeText(this, "Sample Button Clicked", Toast.LENGTH_SHORT).show()
            R.id.sendButton -> {
                if (textInputName.text.isNullOrEmpty()) {
                    Toast.makeText(this, "Text Input Empty", Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(baseContext, QuizActivity::class.java)
                    intent.putExtra("name", textInputName.text.toString())
                    startActivity(intent)
                }
            }
        }
    }

//    fun calculate(view: View) {
//        var numberOne: Int? = numberOneEditText.text.toString().toIntOrNull()
//        var numberTwo: Int? = numberTwoEditText.text.toString().toIntOrNull()
//        if(numberOne === null || numberTwo === null) {
//            Toast.makeText(this, "Both number should be integer", Toast.LENGTH_SHORT).show()
//            return
//        }
//        Toast.makeText(this, "Result :: ${numberOne + numberTwo}", Toast.LENGTH_LONG).show()
//    }

}
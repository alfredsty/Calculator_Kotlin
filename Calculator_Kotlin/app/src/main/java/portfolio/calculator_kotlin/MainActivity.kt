package portfolio.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val et_number_1: EditText by lazy {
        findViewById(R.id.et_number_1)
    }
    private val et_number_2: EditText by lazy {
        findViewById(R.id.et_number_2)
    }
    private val PlusButton: Button by lazy {
        findViewById(R.id.PlusButton)
    }
    private val MinusButton: Button by lazy {
        findViewById(R.id.MinusButton)
    }
    private val DividButton: Button by lazy {
        findViewById(R.id.DividButton)
    }
    private val MultiButton: Button by lazy {
        findViewById(R.id.MultiButton)
    }
    private val resultView: TextView by lazy {
        findViewById(R.id.resultView)
    }
    private val initialization: Button by lazy {
        findViewById(R.id.initialization)
    }
    lateinit var edit1: EditText
    lateinit var edit2: EditText
    lateinit var TextResult: TextView
    lateinit var num1: String;
    lateinit var num2: String
    var result: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PlusButton.setOnClickListener() {
            num1 = et_number_1.text.toString()
            num2 = et_number_2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            resultView.text =  result.toString()
            false
        }
        MinusButton.setOnClickListener() {
            num1 = et_number_1.text.toString()
            num2 = et_number_2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            resultView.text =  result.toString()
            false
        }

        MultiButton.setOnClickListener() {
            num1 = et_number_1.text.toString()
            num2 = et_number_2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            resultView.text =  result.toString()
            false
        }
        DividButton.setOnClickListener() {
            num1 = et_number_1.text.toString()
            num2 = et_number_2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            resultView.text =  result.toString()
            false
        }

    }

}
package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app is a quiz with 5 questions on the Android Operating System.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called once the SubmitResults button is pressed and it calculates the score.
     */
    public void onSubmitButtonClicked(View view) {
        //Creating an integer to save the score and setting it to 0 on every button press so it won't add up to infinity
        int score = 0;
        //Creating a String to display the resulting score
        String totalScore;
        //Checking if the right answers are checked or typed
        RadioButton question1A = findViewById(R.id.optionA);
        RadioButton question2C = findViewById(R.id.optionCb);
        RadioButton question3C = findViewById(R.id.optionCc);
        CheckBox question4CheckBoxA = findViewById(R.id.checkboxA);
        CheckBox question4CheckBoxC = findViewById(R.id.checkboxC);
        //Assigning the values into a boolean and String
        boolean answer1A = question1A.isChecked();
        boolean answer2C = question2C.isChecked();
        boolean answer3C = question3C.isChecked();
        boolean answer4A = question4CheckBoxA.isChecked();
        boolean answer4C = question4CheckBoxC.isChecked();
        EditText textAnswer = findViewById(R.id.editTextAnswer);
        String editText = textAnswer.getText().toString();
        //If the right answers are checked then add 1 to the total score
        if (answer1A) {
            score = score + 1;
        }
        if (answer2C) {
            score = score + 1;
        }
        if (answer3C) {
            score = score + 1;
        }
        if (answer4A) {
            score = score + 1;
        }
        if (answer4C) {
            score = score + 1;
        }
        if (editText.equals("Oreo")) {
            score = score + 1;
        }
        //Display a Toast Message with the results
        totalScore = "You scored " + score + " out of 6!";
        Toast.makeText(this, totalScore, Toast.LENGTH_LONG).show();
    }
}

package com.example.layout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.primaryTextView);
    }

    @SuppressLint("SetTextI18n")
    public void clickedOne(View view) {
        textView.setText(textView.getText() + "1");
    }
    @SuppressLint("SetTextI18n")
    public void clickedTwo(View view){
        textView.setText(textView.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void clickedThree(View view){
        textView.setText(textView.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void clickedFour(View view){
        textView.setText(textView.getText() + "4");
    }


    @SuppressLint("SetTextI18n")
    public void clickedFive(View view){
        textView.setText(textView.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void clickedSix(View view){
        textView.setText(textView.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void clickedSeven(View view){
        textView.setText(textView.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void clickedEight(View view){
        textView.setText(textView.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void clickedNine(View view){
        textView.setText(textView.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void clickedZero(View view){
        textView.setText(textView.getText() + "0");
    }


}
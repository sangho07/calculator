package com.example.maytinh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   Button buttonAdd, buttonSub, buttonMulti,buttonDiv;
    EditText editTextNum1, editTextNum2;
    TextView textViewAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMulti = findViewById(R.id.btnMulti);
        buttonDiv = findViewById(R.id.btnDiv);
        editTextNum1= findViewById(R.id.etNum1);
        editTextNum2= findViewById(R.id.etNum2);
        textViewAnswer= findViewById(R.id.tvAnswer);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1= Integer.parseInt(editTextNum1.getText().toString());
                int number2= Integer.parseInt(editTextNum2.getText().toString());
                int sum = number1+number2;
                textViewAnswer.setText("Answer: "+ String.valueOf(sum));
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1= Integer.parseInt(editTextNum1.getText().toString());
                int number2= Integer.parseInt(editTextNum2.getText().toString());
                int sum = number1-number2;
                textViewAnswer.setText("Answer: "+ String.valueOf(sum));
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1= Integer.parseInt(editTextNum1.getText().toString());
                int number2= Integer.parseInt(editTextNum2.getText().toString());
                int sum = number1*number2;
                textViewAnswer.setText("Answer: "+ String.valueOf(sum));
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1= Integer.parseInt(editTextNum1.getText().toString());
                int number2= Integer.parseInt(editTextNum2.getText().toString());
                int sum = number1/number2;
                textViewAnswer.setText("Answer: "+ String.valueOf(sum));
            }
        });
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("answer", sum);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String.valueOf(sum)= savedInstanceState.getInt(key:"answer");
        textViewAnswer.setText("Answer: " + sum);
    }
}
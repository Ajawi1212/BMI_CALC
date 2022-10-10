package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etWeight,etHeight;
    private TextView RES1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponents();
    }

    private void connectComponents()
    {
        etWeight=findViewById(R.id.etWeight);
        etHeight=findViewById(R.id.etHeight);
    }


    public void CalcMale(View view)
    {
        TextView results =  findViewById(R.id.RES1);
        String value1= etWeight.getText().toString();
        Double weight=Double.parseDouble(value1);
        String value2= etHeight.getText().toString();
        Double height=Double.parseDouble(value2);
        Double BMI =weight/((height/100)*(height/100));

        results.setText("You're BMI is "+BMI);
        TextView status =  findViewById(R.id.STATUS);
        if(BMI<18.5)status.setText("Underweight");
        if(BMI>=18.5&&BMI<24.9)status.setText("Normal");
        if(BMI>=25&&BMI<29.9)status.setText("Overweight");
        if(BMI>=30)status.setText("Obese");

    }
}
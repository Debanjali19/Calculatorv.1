package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addition = (Button) findViewById(R.id.addition);
        Button subtraction = (Button) findViewById(R.id.subtraction);
        Button multiplication = (Button) findViewById(R.id.multiplication);
        Button division = (Button) findViewById(R.id.division);
        final TextView firstnumber=(TextView) findViewById(R.id.firstnumber);
        final TextView secondnumber=(TextView) findViewById(R.id.secondnumber);
          final TextView result=(TextView) findViewById(R.id.result);


        addition.setOnClickListener(
            new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double i = Double.parseDouble(firstnumber.getText().toString());
                    double j = Double.parseDouble(secondnumber.getText().toString());
                    double res = i + j;
                    String s = Double.toString(res);
                    result.setText(s);
                }


            }
        );

        subtraction.setOnClickListener (
            new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double i = Double.parseDouble(firstnumber.getText() +" ");
                    double j = Double.parseDouble(secondnumber.getText() + " ");
                    double res = i - j;
                    String s = Double.toString(res);
                    result.setText(s);
                }


            }
        );

        multiplication.setOnClickListener (
            new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double i = Double.parseDouble(firstnumber.getText() + "");
                    double j = Double.parseDouble(secondnumber.getText()+"");
                    double res = i * j;
                    String s = Double.toString(res);
                    result.setText(s);
                }

            }
        );

            division.setOnClickListener(
            new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double i = Double.parseDouble(firstnumber.getText()+"");
                    double j = Double.parseDouble(secondnumber.getText()+"");
                    String s;
                    if (j == 0)
                        s = "division by 0 not allowed";
                    double res = i / j;
                    s = Double.toString(res);
                    result.setText(s);
                }


            }
            );
    }


}

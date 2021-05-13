package com.example.bmi;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.widget.SimpleAdapter.*;
import android.view.*;
import android.widget.Button;
import android.content.Intent;

import org.w3c.dom.Text;

public class MainActivity extends Activity
{
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight=(EditText)findViewById(R.id.weight);
        EditText height=(EditText)findViewById(R.id.height);
        Button btn=(Button)findViewById(R.id.btn);
        TextView i=(TextView)findViewById(R.id.i);



        btn.setOnClickListener(new View .OnClickListener() {

            @Override
            public void onClick(View p1) {

                double a = Double.parseDouble(weight.getText().toString());
                double b = Double.parseDouble(height.getText().toString());
                double bmi = (a / b / b) * 10000;
                System.out.println("Your BMI is: " + bmi);


                i.setText(String.valueOf(bmi));

            }
        });
    }

}
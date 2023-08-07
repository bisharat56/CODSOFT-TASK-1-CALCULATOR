package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {



    String data;

    Button clear_btn , btn_percentage ,btn_divide ,btn_multiply,btn_subtract, btn_add,btn_equal;

    Button btn_point,btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;

    EditText input_txt, result_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        clear_btn = findViewById(R.id.clear_btn);
        btn_add = findViewById(R.id.btn_add);
        btn_subtract = findViewById(R.id.btn_subtract);
        btn_divide = findViewById(R.id.btn_divide);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_equal = findViewById(R.id.btn_equal);
        btn_point = findViewById(R.id.btn_point);
        btn_percentage = findViewById(R.id.btn_percentage);


        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        input_txt = findViewById(R.id.input_txt);
        result_txt = findViewById(R.id.result_txt);


        //clear Button Listener

        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_txt.setText("");
                result_txt.setText("");

            }
        });


        // Add Button Listener

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                data = input_txt.getText().toString();
                input_txt.setText(data + "+");
            }
        });


        // subtract Button Listener

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = input_txt.getText().toString();
                input_txt.setText(data + "-");
            }
        });


        // Multiply Button Listener

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = input_txt.getText().toString();
                input_txt.setText(data + "×");
            }
        });


        // divide Button Listener

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = input_txt.getText().toString();
                input_txt.setText(data + "÷");
            }
        });


        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = input_txt.getText().toString();
                input_txt.setText(data + ".");
            }
        });


        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_txt.getText().toString();
                input_txt.setText(data + "%");
            }
        });


        //All number clicked Listener


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input_txt.getText().toString();
                input_txt.setText(data + "0");
            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data= input_txt.getText().toString();
                input_txt.setText(data+ "1");

            }
        });


        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data= input_txt.getText().toString();
                input_txt.setText(data+ "2");

            }
        });


        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 data= input_txt.getText().toString();
                 input_txt.setText(data+ "3");
            }
        });



        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input_txt.getText().toString();
                input_txt.setText(data+"4");
            }
        });


        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input_txt.getText().toString();
                input_txt.setText(data+"5");
            }
        });


        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input_txt.getText().toString();
                input_txt.setText(data+"6");
            }
        });


        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               data = input_txt.getText().toString();
               input_txt.setText(data+"7");

            }
        });


        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input_txt.getText().toString();
                input_txt.setText(data+"8");
            }
        });


        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data= input_txt.getText().toString();
                input_txt.setText(data+"9");
            }
        });


        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                data=input_txt.getText().toString();

                data= data.replaceAll("×","*");
                data= data.replaceAll("%","%");
                data= data.replaceAll("÷","/");



                Context rehino = Context.enter();
                rehino.setOptimizationLevel(-1);

                String finalResult;

                Scriptable scriptable = rehino.initStandardObjects();
                finalResult=rehino.evaluateString(scriptable,data,"javascript",1,null).toString();
                result_txt.setText(finalResult);


            }
        });


    }
}



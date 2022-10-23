package com.example.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText et_input1, et_input2;
    Button btn_add, btn_sub, btn_multi, btn_div;
    TextView tv_result;
    String num1, num2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_input1 = (EditText) findViewById(R.id.et_input1);
        et_input2 = (EditText) findViewById(R.id.et_input2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_div = (Button) findViewById(R.id.btn_div);
        tv_result = (TextView) findViewById(R.id.tv_result);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditText дээр хэрэглэгчийн гараас оруулсан утгыг авч,
                // string өгөгдлийн төрөлтэй хувьсагчид хадгалж байна.
                num1 = et_input1.getText().toString();
                num2 = et_input2.getText().toString();
                //Дээрх хоёр хувьсагчийг int өгөгдлийн төрөл рүү хөрвүүлж нийлбэрийг нь олох
                result = Float.parseFloat(num1) + Float.parseFloat(num2);
                // setText() функцийг ашиглан TextView дээр харагдах текстийг өгч байна.
                tv_result.setText("Хариу : " + Float.toString(result)); }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = et_input1.getText().toString();
                num2 = et_input2.getText().toString();
                result = Float.parseFloat(num1) - Float.parseFloat(num2);
                tv_result.setText("Хариу: " + Float.toString(result)); }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = et_input1.getText().toString();
                num2 = et_input2.getText().toString();
                result = Float.parseFloat(num1) * Float.parseFloat(num2);
                tv_result.setText("Хариу: " + Float.toString(result)); }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                num1 = et_input1.getText().toString();
                num2 = et_input2.getText().toString();
                result = Float.parseFloat(num1) / Float.parseFloat(num2);
                tv_result.setText("Хариу: " + Float.toString(result)); }
        });
    }
}
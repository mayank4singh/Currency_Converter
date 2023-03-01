package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,dollar,pound,yen,franc,dinar,ausdollar,candollar,bitcoin;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        franc = findViewById(R.id.franc);
        dinar = findViewById(R.id.dinar);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        bitcoin = findViewById(R.id.bitcoin);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.011;
                    DecimalFormat numberformat = new DecimalFormat("#.000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.012;
                    DecimalFormat numberformat = new DecimalFormat("#.0000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.010;
                    DecimalFormat numberformat = new DecimalFormat("#.0000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*1.65;
                    DecimalFormat numberformat = new DecimalFormat("#.000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });


        franc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.011;
                    DecimalFormat numberformat = new DecimalFormat("#.0000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });


        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.0037;
                    DecimalFormat numberformat = new DecimalFormat("#.00000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.018;
                    DecimalFormat numberformat = new DecimalFormat("#.00000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.017;
                    DecimalFormat numberformat = new DecimalFormat("#.0000000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = editText.getText().toString();

                if(TextUtils.isEmpty(c)){
                    editText.setError("empty user input");
                }
                else{
                    double n,k;
                    n =Double.parseDouble(c);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n* 0.00000051;
                    DecimalFormat numberformat = new DecimalFormat("#.000000000");
                    textView.setText("" + numberformat.format(k));

                }
            }
        });




    }
}
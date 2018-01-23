package com.saurabh.userinterface01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView6 = (TextView) findViewById(R.id.textView6);

        String text = "<font color=#FFFFFF>I AM NEW IN HERE !! </font> <font color=#F69679><u>SIGN UP</u></font>";
        textView6.setText(Html.fromHtml(text));
    }
}

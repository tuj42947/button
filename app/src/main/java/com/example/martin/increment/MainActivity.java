package com.example.martin.increment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button btn = (Button) findViewById(R.id.buttonCount);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count++;
            TextView textView = (TextView) findViewById(R.id.txtCountDisplay);
            textView.setText("Hello World!" + count);
        }
    });





    }}


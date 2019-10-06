package com.example.sunshinemyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myTexts;
    private EditText myE;
          // private TextView weatherTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myE = (EditText) findViewById(R.id.url_edit_text);
        myTexts=findViewById(R.id.url_text);
        //weatherTexts = (TextView) findViewById(R.id.weather_List);

        }
    }

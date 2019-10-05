package com.example.sunshinemyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sunshinemyproject.ToyNamesList;
import com.example.sunshinemyproject.WeatherList;

public class MainActivity extends AppCompatActivity {
    private TextView myTexts;
          // private TextView weatherTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTexts = (TextView) findViewById(R.id.good_morning_text);
        //weatherTexts = (TextView) findViewById(R.id.weather_List);
        String[] names = ToyNamesList.getToyNames();
        //String[] weather = WeatherList.printList();
for (String name:names){
    myTexts.append(name+"\n\n\n");


            }
        }
    }

package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView lbl_time;
    Button start;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        lbl_time = findViewById(R.id.timePomodoroSecond);
        start = findViewById(R.id.button_start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;

                for(i = 0; i < 60; i++){
                    try {

                        Handler handler;
                    }catch (Exception e){

                    }
                }
            }
        });


    }
}
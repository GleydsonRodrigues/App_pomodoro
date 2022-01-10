package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView lbl_time;
    Button start;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        lbl_time = findViewById(R.id.timePomodoroSeconds);
        start = findViewById(R.id.button_start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delayProgram();
            }
        });


    }
    private void delayProgram(){
        int i;

        for(i = 0; i < 6; i++){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Toast.makeText(getBaseContext(), String.valueOf(i), Toast.LENGTH_SHORT).show();

        }
    }
}
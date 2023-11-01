package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView dateView;
    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat simpleDateFormatDay = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat simpleDateFormatTime = new SimpleDateFormat("HH:mm:ss");
    String getDay = simpleDateFormatDay.format(date);
    String getTime = simpleDateFormatTime.format(date);
    String getDate = getDay + "\n" + getTime;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        dateView = findViewById(R.id.dateView);
        dateView.setText(getDate);

        ImageButton button = findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private int getDate() {
        return 0;


    }
}
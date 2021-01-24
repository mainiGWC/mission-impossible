package com.example.tts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics wh = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(wh);

        double width = wh.widthPixels;
        double height = wh.heightPixels;

        getWindow().setLayout((int) (width), (int) (height));

        // for opening screen 2 from screen 1
        Button j = (Button) findViewById(R.id.sign_up);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CreateAccount.class));
            }

        });

        Button jj = (Button) findViewById(R.id.sign_in);
        jj.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfilePage.class));
            }
        });
    }
}




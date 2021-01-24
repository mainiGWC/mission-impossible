package com.example.tts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class FullStackLevelMap extends AppCompatActivity{

    @SuppressLint("MissingSuperCall")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_stack_level_map);
        DisplayMetrics wh = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(wh);

        double width = wh.widthPixels;
        double height = wh.heightPixels;

        getWindow().setLayout((int) (width), (int) (height));

        Button j = (Button) findViewById(R.id.button_level1);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FullStackLevelMap.this, Level1.class));
            }

        });
    }
}

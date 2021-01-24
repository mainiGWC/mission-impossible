package com.example.tts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class ProfilePage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.create_account);

        DisplayMetrics wh = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(wh);

        double width = wh.widthPixels;
        double height = wh.heightPixels;

        getWindow().setLayout((int) (width*.9), (int) (height*.4));
        Button jjj = (Button) findViewById(R.id.button4);
        jjj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, MainActivity.class));
            }
        });
    }
}


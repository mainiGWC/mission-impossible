package com.example.tts;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class CreateAccount extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.create_account);

        DisplayMetrics wh = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(wh);

        double width = wh.widthPixels;
        double height = wh.heightPixels;

        getWindow().setLayout((int) (width*.9), (int) (height*.4));




    }
}

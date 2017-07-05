package com.example.sparken02.canvasdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//    DrawView drawView;

    CirclesDrawingView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawView = new CirclesDrawingView(this);
//        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);
    }
}

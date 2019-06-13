package com.example.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SettingCardImages();
    }

    public void SettingCardImages(){
        ImageView image;
        image = (ImageView) findViewById(R.id.TopCardViewImage);
        image.setImageResource(R.drawable.cloudyday3);
    }

}

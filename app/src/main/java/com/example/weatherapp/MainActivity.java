package com.example.weatherapp;

import android.media.Image;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SettingCardImages();
        SettingCardText();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.android_action_bar_spinner_menu, menu);

        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) MenuItemCompat.getActionView(item);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_list_item_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        return true;
    }

    public void SettingCardText(){

    }

    public void SettingCardImages(){
        ImageView image;

        image = (ImageView) findViewById(R.id.TopCardViewImage);
        image.setImageResource(R.drawable.cloudyday3);

        image = (ImageView) findViewById(R.id.mainCard1Image);
        image.setImageResource(R.drawable.thunder);

        image = (ImageView) findViewById(R.id.mainCard2Image);
        image.setImageResource(R.drawable.rainy1);

        image = (ImageView) findViewById(R.id.mainCard3Image);
        image.setImageResource(R.drawable.snowy1);

        image = (ImageView) findViewById(R.id.mainCard4Image);
        image.setImageResource(R.drawable.snowy6);

        image = (ImageView) findViewById(R.id.mainCard5Image);
        image.setImageResource(R.drawable.cloudynight1);

        image = (ImageView) findViewById(R.id.mainCard6Image);
        image.setImageResource(R.drawable.cloudy);

        image = (ImageView) findViewById(R.id.mainCard7Image);
        image.setImageResource(R.drawable.night);


    }

}

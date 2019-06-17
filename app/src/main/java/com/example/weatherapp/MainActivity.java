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
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(myToolbar);

        SettingCardImages();
        SettingCardText();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.settings_view) {

            return true;
        }
        if (id == R.id.map_view)
        {

            return true;
        }

        return super.onOptionsItemSelected(item);
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

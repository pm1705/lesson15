package com.example.lesson15;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class secondactivity extends AppCompatActivity {

    LinearLayout backgroond2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        backgroond2 = (LinearLayout) findViewById(R.id.backgroond);
    }

    public void backup(View view) {
        finish();
    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0,0,400,"pistachio");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        String st = item.getTitle().toString();

        if (id == R.id.menuRed){
            backgroond2.setBackgroundColor(Color.parseColor("#FF6262"));
        }
        else if (id == R.id.menuLightBlue){
            backgroond2.setBackgroundColor(Color.parseColor("#62ADFF"));
        }
        else if (id == R.id.menuSakura){
            backgroond2.setBackgroundColor(Color.parseColor("#FFB0FF"));
        }
        else{
            if (st == "pistachio"){
                backgroond2.setBackgroundColor(Color.parseColor("#B4E7B7"));
            }
        }

        return true;
    }
}
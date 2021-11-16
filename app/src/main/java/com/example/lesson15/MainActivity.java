package com.example.lesson15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{

    LinearLayout backgroond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroond = (LinearLayout) findViewById(R.id.backgroond);
    }

    public void nextup(View view) {
        Intent si = new Intent(this,secondactivity.class);
        startActivity(si);
    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.menuRed){
            backgroond.setBackgroundColor(Color.parseColor("#FF6262"));
        }
         else if (id == R.id.menuLightBlue){
            backgroond.setBackgroundColor(Color.parseColor("#62ADFF"));
        }
        else if (id == R.id.menuSakura){
            backgroond.setBackgroundColor(Color.parseColor("#FFB0FF"));
        }

        return true;
    }
}
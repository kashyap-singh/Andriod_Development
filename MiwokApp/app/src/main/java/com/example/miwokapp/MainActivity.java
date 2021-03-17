package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.number_block);
            }

    public void Number_Activity(View view)
    {
        Intent i=new Intent(this,NumberActivity.class);
        startActivity(i);
    }
    public void Family_Activity(View view)
    {
        Intent i=new Intent(this,FamilyActivity.class);
        startActivity(i);
    }
    public void Colors_Activity(View view)
    {
        Intent i=new Intent(this,ColorsActivity.class);
        startActivity(i);
    }
    public void Phrases_Activity(View view)
    {
        Intent i=new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
}
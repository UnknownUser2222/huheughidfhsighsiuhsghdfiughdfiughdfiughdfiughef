package com.techstudios.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         v = (View) findViewById(android.R.id.content);
         Snackbar.make(v,"Ayan ate some snacks.",Snackbar.LENGTH_INDEFINITE).show();
        Log.i("Snackbar","Success");
    }
}
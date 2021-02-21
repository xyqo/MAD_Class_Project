package com.example.madclassproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;


public class events extends AppCompatActivity {

    private WebView eventsWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        eventsWeb = new WebView(this);


        eventsWeb.loadUrl("https://www.ucc.edu.jm/academic-calendar");
         // eventsWeb.loadUrl("https://www.msn.com");
    }

}




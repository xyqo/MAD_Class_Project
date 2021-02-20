package com.example.madclassproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class admissions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions);

        // get our html content
        String htmlAsString = getString(R.string.html);
        WebView webView = (WebView) findViewById(R.id.wv_admit);
        webView.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null);

    }
}
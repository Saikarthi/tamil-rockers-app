package com.example.karthikeyan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class karthi4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karthi4);
        WebView tam1;
        tam1= findViewById(R.id.kar3);
        WebSettings set1=tam1.getSettings();
        set1.setJavaScriptEnabled(true);
        tam1.loadUrl("http://www.yts.am");
    }
}

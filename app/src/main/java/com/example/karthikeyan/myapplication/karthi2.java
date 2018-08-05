package com.example.karthikeyan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class karthi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karthi2);
        WebView tam2;
        tam2= findViewById(R.id.kar);
        WebSettings set=tam2.getSettings();
        set.setJavaScriptEnabled(true);
        tam2.loadUrl("http://www.tamilrockers.sh");
    }
}

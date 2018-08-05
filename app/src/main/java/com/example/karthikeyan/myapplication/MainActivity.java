package com.example.karthikeyan.myapplication;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void call1(View View){
        Intent k=new Intent(MainActivity.this,karthi2.class);
        startActivity(k);
    }
    public void call2(View View){
        Intent k=new Intent(MainActivity.this,karthi3.class);
        startActivity(k);

    }
    public void call3(View View){
        Intent k=new Intent(MainActivity.this,karthi4.class);
        startActivity(k);

    }
}

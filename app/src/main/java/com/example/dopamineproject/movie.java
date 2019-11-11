package com.example.dopamineproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import java.net.URL;

public class movie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        handleIntent();
    }
    private void handleIntent()
    {
        Intent i = getIntent();
        Uri data = i.getData();
        URL url = null;
        try{
            url = new URL(data.getScheme(),data.getHost(), data.getPath());
        }catch (Exception e){
            e.printStackTrace();
        }
        WebView webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl(url.toString());
    }
}

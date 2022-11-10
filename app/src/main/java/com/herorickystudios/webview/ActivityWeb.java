package com.herorickystudios.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.herorickystudios.webview.R;

//Programado por HeroRicky_Games e Doménica

public class ActivityWeb extends AppCompatActivity {


    WebView webV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webV=(WebView)findViewById(R.id.webView);

        //URL do site
        String url= "www.mariafm.adcast.com.br/";

        //WebViewClient() para que se abra dentro de la aplicacion
        webV.setWebViewClient(new WebViewClient());

        //Iniciamos la busqueda
        webV.loadUrl("https://"+url);
        webV.getSettings().setJavaScriptEnabled(true);
        webV.getSettings().setAllowContentAccess(true);

        //Esconde a action Bar
        getSupportActionBar().hide();

    }
}
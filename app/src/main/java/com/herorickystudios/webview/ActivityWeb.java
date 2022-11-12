package com.herorickystudios.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

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
        String url= "petcarurbaomeupetc.wixsite.com/petcarurb";

        //WebViewClient() para que se abra dentro de la aplicacion
        webV.setWebViewClient(new WebViewClient());

        //Iniciamos la busqueda
        webV.loadUrl("https://"+url);
        webV.getSettings().setJavaScriptEnabled(true);
        webV.getSettings().setAllowContentAccess(true);

        //Esconde a action Bar
        getSupportActionBar().hide();

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Botão voltar foi apertado", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webV.canGoBack()) {
                        webV.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }

}
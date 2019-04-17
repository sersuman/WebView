package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button btnUrl;
    private static EditText etUrl;
    private static WebView webUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openUrl();
    }
    public void openUrl(){
        btnUrl = findViewById(R.id.btnUrl);
        etUrl = findViewById(R.id.etUrl);
        webUrl = findViewById(R.id.weburl);

        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etUrl.getText().toString();
                webUrl.getSettings().setLoadsImagesAutomatically(true);
                webUrl.getSettings().setJavaScriptEnabled(true);
                webUrl.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webUrl.loadUrl(url);

            }
        });
    }
}

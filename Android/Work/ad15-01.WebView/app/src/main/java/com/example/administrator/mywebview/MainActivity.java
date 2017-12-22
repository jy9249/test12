package com.example.administrator.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //위젯선언4개
    private WebView webview;
    private Button btngo, btnback;
    private EditText ddd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //위젯 찾기
        webview = findViewById(R.id.webview);
        btngo = findViewById(R.id.btngo);
        btnback = findViewById(R.id.btnback);
        ddd = findViewById(R.id.ddd);

        //위젯 설정
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}

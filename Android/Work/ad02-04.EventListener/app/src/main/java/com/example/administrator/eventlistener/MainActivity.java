package com.example.administrator.eventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1 = null;
    private Button button2 = null;
    private Button button3 = null;
    private Button button4 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼1찾기
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "무명 클래스 리스너", Toast.LENGTH_SHORT).show();
            }
        });

        //버튼3 찾기
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new innerclass());

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }


    public void inlineclick(View view) {

        Toast.makeText(getApplicationContext(), "inline 리스너", Toast.LENGTH_SHORT).show();
    }

    ;

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "implement 리스너", Toast.LENGTH_SHORT).show();
    }


    private class innerclass implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "내부 클래스 리스너", Toast.LENGTH_SHORT).show();


        }


    }
}



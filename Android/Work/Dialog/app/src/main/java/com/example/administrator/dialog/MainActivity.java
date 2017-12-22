package com.example.administrator.dialog;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn, btn2;
    AlertDialog.Builder dialog;
    final String[] versionArray = new String[]{"젤리빈", "킷켓", "롤리팝"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("제목입니다")
                        .setMessage("이곳이 내용입니다.")
                        .setIcon(R.drawable.movie_icon)
                        .show();

            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("제목입니다");
                dialog.setMessage("이곳이 내용입니다.");
                dialog.setIcon(R.drawable.movie_icon);
                dialog.setPositiveButton("확인", null);
                dialog.show();
            }
        });


    }
}

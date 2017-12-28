package com.example.st2personvieww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private PersonView personview1;
    private ImageView imageselect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageselect = findViewById(R.id.image_select);
        //위젯찾기
        personview1 = findViewById(R.id.view_person);

    }
}

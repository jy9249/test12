package com.example.administrator.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //위젯선언
    private Button addbtn;
    private EditText edt1, edt2, edt3, edt0, edt4, edt5;
    private ListView listview;
    private String[] arrays = null;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //위젯찾기
        text = findViewById(R.id.text);
        listview = findViewById(R.id.listview);
        addbtn = findViewById(R.id.addbtn);
        edt0 = findViewById(R.id.edt0);


        //adapter 생성
        final ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrays);
        listview.setAdapter(mAdapter);


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mAdapter.add(text.getText().toString());


            }
        });
    }
}

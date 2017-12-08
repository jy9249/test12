package com.example.administrator.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button BtnAdd = null;
    private Button BtnSub = null;
    private Button BtnDiv = null;
    private Button BtnMul = null;
    private Button BtnRem = null;
    public TextView textView2 = null;
    private EditText Edit1 = null;
    private EditText Edit2 = null;
    

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("간단한 계산기 만들기");
        Edit1 = findViewById(R.id.Edit1);
        Edit2 = findViewById(R.id.Edit2);
        BtnAdd = findViewById(R.id.BtnAdd);
        BtnSub = findViewById(R.id.BtnDiv);
        BtnMul = findViewById(R.id.BtnMul);
        BtnDiv = findViewById(R.id.BtnRem);
        BtnRem = findViewById(R.id.BtnRem);
        textView2 = findViewById(R.id.textView2);

        BtnAdd = findViewById(R.id.BtnAdd);
    }

    @Override
    public void onClick(View view) {
        String num1 = Edit1.getText().toString();
        String num2 = Edit2.getText().toString();
    if(num1.trim().equals("")|| num2.trim().equals("")) {
        Toast.makeText(getApplicationContext(), "입력 값이 없습니다", Toast.LENGTH_SHORT).show();
    }
    else {
        double result = Double.parseDouble(num1)
        +Double.parseDouble(num2);
        
    }
    }
}

package com.example.administrator.senddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        //1.위젯 선언
    private EditText edittext1=null;
    private Button button1=null;
    private TextView textview1=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                //2.위젯 찾기
                edittext1=findViewById(R.id.edittext1);
                button1=findViewById(R.id.button1);
                textview1=findViewById(R.id.textview1);

                //3.위젯 설정
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //1.edittext1
                        String tmp =edittext1.getText().toString();

                        //2.button1
                textview1.setText(tmp);


            }
        });





    }
}

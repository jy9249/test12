package com.example.administrator.inflation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    //위젯 선언
    private Button btn1, btn2;
    LinearLayout parent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.container);





        //위젯 찾기
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

                inflater.inflate(R.layout.layout_sub1, parent, true); //layout_sub1 이라는 것을 parent의 자식을 하겠다 ->True 아니다 false
                //checkBox 찾기
                CheckBox chk = parent.findViewById(R.id.checkBox);
                chk.setText("Inflation 완료");



                //Button찾기
                Button btn3 = parent.findViewById(R.id.btn3);
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView textView = findViewById(R.id.textView);  //전체에서 찾는방법
                        textView = parent.findViewById(R.id.textView); // 하위단계에서 찾는방법

                        textView.setText("btn2 눌림");
                    }
                });

            }
        });


    }
}

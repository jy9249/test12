package com.example.administrator.scrollview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class addbuttonMainActivity extends AppCompatActivity {
    private Button btnAdd;
    private LinearLayout scroll;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button_main);

        //찾기

        btnAdd = findViewById(R.id.btnAdd);
        scroll = findViewById(R.id.scroll);
        button5 = findViewById(R.id.button5);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step1.추가되는 버튼에 대한 LayoutParam 설정

                //step2. 버튼 생성

                //step3. 생성된 버튼을 LinearLayout에 View.addview()메서드 이용

                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                //마진 추가
                lp.setMargins(10, 10, 10, 10);

                // step2. 버튼생성
                Button btn = new Button(getApplicationContext());
                btn.setText(R.string.app_name);
                btn.setText("push me");
                btn.setLayoutParams(lp);
                btn.setBackgroundColor(Color.DKGRAY);//생성된 버튼의 뷰 영역 설정

                //step3. 생성된 버튼을 ScrollView의 LinearLayout 에 추가
                // View.addView() 메서드 이용
                scroll.addView(btn);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );


                for (int i = 1; i <= 5; i = i + 1) {
                    Button button5 = new Button(getApplicationContext());
                    button5.setText(R.string.app_name);
                    button5.setText("push me");
                    button5.setLayoutParams(lp);
                    button5.setBackgroundColor(Color.DKGRAY);
                    scroll.addView(button5);

                }


            }
        });


    }
}
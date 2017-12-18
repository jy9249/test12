package com.example.administrator.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class AutoIncrementScrollViewMainActivity extends AppCompatActivity {
private ScrollView scroll;
private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_increment_scroll_view_main);
//찾기
        scroll=findViewById(R.id.scroll);
        layout=findViewById(R.id.layout);

        //설정 scrolview.onscroasdfasdf핸들러 작성
        scroll.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {

            }
        });
    }
}

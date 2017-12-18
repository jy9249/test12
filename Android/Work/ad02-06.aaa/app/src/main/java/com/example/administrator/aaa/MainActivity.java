package com.example.administrator.aaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgpDirection = null;
    private RadioGroup rgpGravity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //찾기
        rgpDirection = findViewById(R.id.rgpDirection);
        rgpGravity = findViewById(R.id.rgpGravity);


        //설정
        rgpDirection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                    if (i == R.id.rdoH) {
                        rgpDirection.setOrientation(LinearLayout.HORIZONTAL);

                    } else if (i == R.id.rdoV) {
                        rgpDirection.setOrientation(LinearLayout.VERTICAL);
                    }
                }

        });

        rgpGravity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rdoleft) {
                    rgpGravity.setGravity(Gravity.LEFT);
                } else if (i == R.id.rdocenter) {
                    rgpGravity.setGravity(Gravity.CENTER);
                } else if (i == R.id.rdoright) {
                    rgpGravity.setGravity(Gravity.RIGHT);
                }
            }
        });


    }
}



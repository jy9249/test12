package com.example.administrator.pet;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    RadioGroup Rgroup1;
    CheckBox chkAgree;
    TextView Text1, Text2;
    RadioButton RdoDog, Rdocat, Rdorab;
    Button BtnOk;
    ImageView ImgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        Text1 = findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.chkAgree);
        Text2 = findViewById(R.id.Text2);
        Rgroup1 = findViewById(R.id.Rgroup1);
        RdoDog = findViewById(R.id.RdoDog);
        Rdocat = findViewById(R.id.Rdocat);
        Rdorab = findViewById(R.id.Rdorab);

        BtnOk = findViewById(R.id.BtnOk);
        ImgPet = findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                if (chkAgree.isChecked() == true) {
                    Text2.setVisibility(View.VISIBLE);
                    Rgroup1.setVisibility(View.VISIBLE);
                    BtnOk.setVisibility(View.VISIBLE);
                    ImgPet.setVisibility(View.VISIBLE);
                } else {
                    Text2.setVisibility(View.INVISIBLE);
                    Rgroup1.setVisibility(View.INVISIBLE);
                    BtnOk.setVisibility(View.INVISIBLE);
                }
            }

        });
        BtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (Rgroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoDog:
                        ImgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.Rdocat:
                        ImgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.Rdorab:
                        ImgPet.setImageResource(R.drawable.lollipop);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물을 선택하시오", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}


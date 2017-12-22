package com.example.st2preference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edtNum;
    private EditText edtText;
    private CheckBox ckbSound;
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        edtNum = findViewById(R.id.edtNum);
        edtText = findViewById(R.id.edtText);
        ckbSound = findViewById(R.id.ckbSound);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = pref.edit();


                editor.putBoolean("SOUND_SET", ckbSound.isChecked());
                editor.putInt("TEXT_NUMBER", Integer.parseInt(edtNum.getText().toString()));
                editor.putString("TEXT_STRING", edtText.getText().toString());
                editor.apply();
            }
        });

        pref = getSharedPreferences("Settings", MODE_PRIVATE);

        Boolean chk = pref.getBoolean("SOUND_SET", false);
        Integer number = pref.getInt("TEXT_NUMBER", -1);
        String txt = pref.getString("TEXT_STRING", "");

        ckbSound.setChecked(chk);
        edtNum.setText(number.toString());
        edtText.setText(txt);

    }
}

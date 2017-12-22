package com.example.administrator.menywidget;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtID;
    private EditText edtPW;
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        edtID = findViewById(R.id.edtID);
        edtPW = findViewById(R.id.edtPW);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtID.getText().toString().trim().equals("111") && edtPW.getText().toString().trim().equals("111")) {
                    //로그인 성공


                    SharedPreferences.Editor editor = pref.edit();
                    
                    
                    editor.putString("LOGIN_ID", edtID.getText().toString());

                    editor.putBoolean("LOGIN_STATUS", true);
                    
                    editor.apply();
                    
                    //결과 반환 코드 작성
                    Intent data = new Intent();

                    //intent 에 변환 값
                    data.putExtra(Code.LOGIN_ID, true);
                    //결과반환
                    setResult(RESULT_OK, data);
                    //화면 종료
                    finish();


                } else

                {
                    Toast.makeText(getApplicationContext(), R.string.login_fail, Toast.LENGTH_SHORT).show();
                }
            }

        });


        pref = getSharedPreferences(Code.FILE_PREFERENCE, MODE_PRIVATE);
        String id =pref.getString(Code.LOGIN_ID,"");
        String pwtxt=pref.getString(Code.LOGIN_PW,"");




        Integer number = pref.getInt("TEXT_NUMBER", 111);
        String txt = pref.getString("TEXT_STRING", "");


        edtID.setText(txt);
        edtPW.setText(number.toString());
    }
}



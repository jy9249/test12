package com.example.administrator.simplecalculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRem = (Button) findViewById(R.id.BtnRem);

        textResult = (TextView) findViewById(R.id.TextResult);

        innerclass handler = new innerclass();
        btnAdd.setOnClickListener(handler);
        btnSub.setOnClickListener(handler);
        btnMul.setOnClickListener(handler);
        btnDiv.setOnClickListener(handler);
        btnRem.setOnClickListener(handler);


    }


    private class innerclass implements View.OnClickListener {
        @Override
        public void onClick(View arg0) {

            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();

            if (num1.equals("") || num2.equals("")) {
                Toast.makeText(getApplicationContext(), "값을 입력하시오", Toast.LENGTH_SHORT).show();
            }

            switch (arg0.getId()) {


                case R.id.BtnAdd:


                    result = Double.parseDouble(num1)
                            + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());

                    break;


                case R.id.BtnSub:


                    result = Double.parseDouble(num1)
                            - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());

                    break;


                case R.id.BtnMul:


                    result = Double.parseDouble(num1)
                            * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());

                    break;

                case R.id.BtnDiv:


                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(),
                                "0으로 나누면 안됩니다!", Toast.LENGTH_SHORT).show();

                    } else {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);

                        textResult.setText("계산 결과 : " + result.toString(result));
                    }


                    break;
                case R.id.BtnRem:

                        result = Double.parseDouble(num1)  % Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());

                    break;

                default:
                    break;
            }

        }
    }
}












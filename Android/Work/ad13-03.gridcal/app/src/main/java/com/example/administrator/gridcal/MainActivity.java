package com.example.administrator.gridcal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //각각 위젯에 변수 선언

    EditText Edit1;
    Button[] mathButton = new Button[4];
    Integer[] math = {R.id.BtnAdd, R.id.BtnSub, R.id.BtnMul, R.id.BtnDiv};
    String num1, num2;
    Button[] numButtons = new Button[10];
    Integer[] numbBtnIDs = {R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3, R.id.BtnNum4, R.id.BtnNum5,
            R.id.BtnNum6, R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum9};
    Integer result;
    Button 결과값, BtnNumAC, btnNumC;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //17자 제한 하기

        Edit1 = findViewById(R.id.Edit1);
        Edit1.setInputType(0);

        Edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Calc c = new Calc();
                String[] operators = {"+", "-", "*", "/"};
                int cnt = c.getLastIndex(num1, operators);
                if (num1.length() - cnt >= 17) {
                    int aaa = num1.length();
                    num1 = num1.substring(0, aaa - 1);
                    Edit1.setText(num1);
                    Toast.makeText(getApplicationContext(), "더 이상 입력 안됩니다.", Toast.LENGTH_SHORT).show();



                    /*String av =num1.substring(num1.length(),num1.length()+1);
                 av=(num1.substring(num1.length()-1,num1.length()));*/
                    /* final int MAX_LENGTH = cnt+18;

                    InputFilter[] inputFilter = new InputFilter[1];
                    inputFilter[0] = new InputFilter.LengthFilter(MAX_LENGTH);
                    charSequence.setFilters(inputFilter);*/


                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //math관련 변수에 activity_main.xml 파일의 위젯 id를 대입
        for (i = 0; i < math.length; i++) {
            mathButton[i] = findViewById(math[i]);
        }
        for (i = 0; i < math.length; i++) {
            final int aa;
            aa = i;
            mathButton[aa].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int leng = num1.length();
                    String aaaa = num1.substring(leng - 1, leng);

                    if (aaaa.contains("+")) {

                        num1 = Edit1.getText().toString() + mathButton[aa].getText().toString();
                        num1 = num1.substring(0, leng - 1) + "+";

                        Edit1.setText(num1);


                        Toast.makeText(getApplicationContext(), "더 이상 입력 안됩니다.", Toast.LENGTH_SHORT).show();
                    } else if (aaaa.contains("-")) {
                        num1 = Edit1.getText().toString() + mathButton[aa].getText().toString();
                        num1 = num1.substring(0, leng - 1) + "-";

                        Edit1.setText(num1);
                    } else if (aaaa.contains("*")) {
                        num1 = Edit1.getText().toString() + mathButton[aa].getText().toString();
                        num1 = num1.substring(0, leng - 1) + "*";

                        Edit1.setText(num1);
                    } else if (aaaa.contains("/")) {
                        num1 = Edit1.getText().toString() + mathButton[aa].getText().toString();
                        num1 = num1.substring(0, leng - 1) + "/";

                        Edit1.setText(num1);
                    } else {
                        num1 = Edit1.getText().toString() + mathButton[aa].getText().toString();
                        Edit1.setText(num1);
                    }

                }
            });
        }


        //number관련 변수에 activity_main.xml 파일의 위젯 id 대입


        for (i = 0; i < numbBtnIDs.length; i++) {
            numButtons[i] = findViewById(numbBtnIDs[i]);
        }
        for (i = 0; i < numbBtnIDs.length; i++) {
            final int index;
            index = i;


            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Edit1.isFocused() == true) {
                        num1 = Edit1.getText().toString() + numButtons[index].getText().toString();
                        Edit1.setText(num1);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 선택하시오", Toast.LENGTH_SHORT).show();
                    }

                }

            });
        }


        btnNumC = findViewById(R.id.btnNumC);
        btnNumC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1.substring(0, num1.length() - 1);
                Edit1.setText(num1);

            }
        });


        BtnNumAC = findViewById(R.id.BtnNumAC);
        BtnNumAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = "";
                Edit1.setText(num1);
            }
        });


        //"=" 버튼 기능
        결과값 = findViewById(R.id.결과값);
        결과값.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1 == null) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하시오", Toast.LENGTH_SHORT).show();
                } else {
                    String infixExp = num1;
                    System.out.println("중위 표기법 " + infixExp);

                    Calc c = new Calc();

                    // 수식 검증
                    if (!c.bracketsBalance(infixExp)) {
                        System.out.println("괄호를 정확히 하세요~");
                        System.exit(1);
                    }

                    // 중위 표기법을 후위 표기법으로 바꾸기
                    String postfixExp = c.postfix(infixExp);
                    System.out.println("후위 표기법 : " + postfixExp);

                    // 후위 표기법을 이용하여 수식 계산
                    Double result = c.result(postfixExp);

                    // 결과 출력
                    System.out.println("The result = " + result);
                    Edit1.setText(result.toString());
                }
            }

        });


    }


}






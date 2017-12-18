package com.example.administrator.gridcal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String infixExp = "(1+2)*3 + 4";
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

    }
    @Test
    public void test123() throws Exception {
        String infixExp = "(1+2)*3+4";

        Calc c = new Calc();

        String[] operators= {"+","-","\u00D7","\u00F7"};

        int cnt = c.getLastIndex(infixExp,operators);
        assertEquals(cnt,7);


        infixExp = "(1+2)*3747+7456-47\u00f7664";
        cnt = c.getLastIndex(infixExp,operators);
        assertEquals(cnt,18);
        assertEquals(infixExp.length()-cnt,4);


    }
}
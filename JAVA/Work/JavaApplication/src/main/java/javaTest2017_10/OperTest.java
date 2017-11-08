package javaTest2017_10;

import java.util.Scanner;

import java11.st4oper.Oper;

public class OperTest {
    
    public static void main(String[] args) {
       Scanner keyboard =new Scanner(System.in);
       System.out.println("First num 입력하시오");
       int F = keyboard.nextInt();
       
       System.out.println("Second num 입력하시오");
       int S = keyboard.nextInt();
       Oper op = new Oper(F, S);
       
       op.Add();
       op.Minus();
       op.Mul();
       op.Div();
       
 
       
    }
    
}
